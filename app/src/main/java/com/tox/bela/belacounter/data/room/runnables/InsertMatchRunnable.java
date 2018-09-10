package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Match;
import com.tox.bela.belacounter.data.room.models.Player;

public class InsertMatchRunnable extends BaseRunnable {

    private DatabaseCallback<Void> callback;
    private final Context context;
    private final Match match;

    public InsertMatchRunnable(Context context, Match match, DatabaseCallback<Void> callback){
        super(context, callback);
        this.context = context;
        this.match = match;
        this.callback = callback;
    }

    @Override
    public Void query(){
        RoomDatabaseFactory.db(context).matchDao().insertMatch(match);
        return null;
    }
}
