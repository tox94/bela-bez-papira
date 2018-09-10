package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Player;

public class GetPlayerByIdRunnable extends BaseRunnable {

    private final DatabaseCallback<Player> callback;
    private final Context context;
    private String playerId;

    public GetPlayerByIdRunnable(Context context, DatabaseCallback<Player> callback, String playerId){
        super(context, callback);
        this.context = context;
        this.callback = callback;
        this.playerId = playerId;
    }

    @Override
    public Player query(){
        return RoomDatabaseFactory.db(context).playerDao().getPlayerById(playerId);
    }
}
