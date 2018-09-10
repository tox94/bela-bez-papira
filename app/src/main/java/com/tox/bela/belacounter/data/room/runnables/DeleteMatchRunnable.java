package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Match;

public class DeleteMatchRunnable extends BaseRunnable {

    private DatabaseCallback<Void> callback;
    private final Context context;
    private final Match match;

    public DeleteMatchRunnable(Context context, Match match, DatabaseCallback<Void> callback){
        super(context, callback);
        this.context = context;
        this.match = match;
        this.callback = callback;
    }

    @Override
    public Void query(){
        RoomDatabaseFactory.db(context).matchDao().deleteMatch(match);
        return null;
    }
}
