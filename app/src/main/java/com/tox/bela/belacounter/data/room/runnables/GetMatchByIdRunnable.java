package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Match;
import com.tox.bela.belacounter.data.room.models.Player;

public class GetMatchByIdRunnable extends BaseRunnable {

    private final DatabaseCallback<Match> callback;
    private final Context context;
    private String matchId;

    public GetMatchByIdRunnable(Context context, DatabaseCallback<Match> callback, String matchId){
        super(context, callback);
        this.context = context;
        this.callback = callback;
        this.matchId = matchId;
    }

    @Override
    public Match query(){
        return RoomDatabaseFactory.db(context).matchDao().getMatchById(matchId);
    }
}
