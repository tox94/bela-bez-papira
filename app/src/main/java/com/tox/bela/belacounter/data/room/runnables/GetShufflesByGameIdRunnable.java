package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Game;
import com.tox.bela.belacounter.data.room.models.Shuffle;

import java.util.List;

public class GetShufflesByGameIdRunnable extends BaseRunnable {

    private final DatabaseCallback<List<Shuffle>> callback;
    private final Context context;
    private final String gameId;

    public GetShufflesByGameIdRunnable(Context context, DatabaseCallback<List<Shuffle>> callback, String gameId){
        super(context, callback);
        this.context = context;
        this.callback = callback;
        this.gameId = gameId;
    }

    @Override
    public List<Shuffle> query(){
        return RoomDatabaseFactory.db(context).shuffleDao().getShufflesByGameId(gameId);
    }
}
