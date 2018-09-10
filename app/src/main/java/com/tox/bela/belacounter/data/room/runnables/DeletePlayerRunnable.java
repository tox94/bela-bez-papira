package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Player;

public class DeletePlayerRunnable extends BaseRunnable {

    private DatabaseCallback<Void> callback;
    private final Context context;
    private final Player player;

    public DeletePlayerRunnable(Context context, Player player, DatabaseCallback<Void> callback){
        super(context, callback);
        this.context = context;
        this.player = player;
        this.callback = callback;
    }

    @Override
    public Void query(){
        RoomDatabaseFactory.db(context).playerDao().deletePlayer(player);
        return null;
    }
}
