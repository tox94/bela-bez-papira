package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Player;

import java.util.List;

public class GetAllPlayersRunnable extends BaseRunnable {

    private final DatabaseCallback<List<Player>> callback;
    private final Context context;

    public GetAllPlayersRunnable(Context context, DatabaseCallback<List<Player>> callback){
        super(context, callback);
        this.context = context;
        this.callback = callback;
    }

    @Override
    public List<Player> query(){
        return RoomDatabaseFactory.db(context).playerDao().getAllPlayers();
    }
}
