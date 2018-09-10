package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Game;
import com.tox.bela.belacounter.data.room.models.Match;

import java.util.List;

public class GetGamesByMatchIdRunnable extends BaseRunnable {

    private final DatabaseCallback<List<Game>> callback;
    private final Context context;
    private final String matchId;

    public GetGamesByMatchIdRunnable(Context context, DatabaseCallback<List<Game>> callback, String matchId){
        super(context, callback);
        this.context = context;
        this.callback = callback;
        this.matchId = matchId;
    }

    @Override
    public List<Game> query(){
        return RoomDatabaseFactory.db(context).gameDao().getGamesByMatchId(matchId);
    }
}
