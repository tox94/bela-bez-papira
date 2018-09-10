package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Game;
import com.tox.bela.belacounter.data.room.models.Shuffle;

public class InsertShuffleRunnable extends BaseRunnable {

    private DatabaseCallback<Void> callback;
    private final Context context;
    private final Shuffle shuffle;

    public InsertShuffleRunnable(Context context, Shuffle shuffle, DatabaseCallback<Void> callback){
        super(context, callback);
        this.context = context;
        this.shuffle = shuffle;
        this.callback = callback;
    }

    @Override
    public Void query(){
        RoomDatabaseFactory.db(context).shuffleDao().insertShuffle(shuffle);
        return null;
    }
}
