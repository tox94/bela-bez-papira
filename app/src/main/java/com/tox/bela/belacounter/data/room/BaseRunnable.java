package com.tox.bela.belacounter.data.room;

import android.content.Context;
import android.os.Looper;
import android.os.Handler;

public abstract class BaseRunnable<T> implements Runnable {

    public abstract T query();

    private final DatabaseCallback<T> callback;
    private final Context context;

    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public BaseRunnable(Context context, DatabaseCallback<T> callback){
        this.context = context;
        this.callback = callback;
    }

    @Override
    public void run(){
        try{
            final T data = query();
            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    callback.onSuccess(data);
                }
            });
        } catch (final Exception e){
            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    callback.onError(e);
                }
            });
        }
    }
}
