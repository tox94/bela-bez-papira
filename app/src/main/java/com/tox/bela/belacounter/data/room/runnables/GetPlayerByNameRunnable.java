package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;
import android.provider.ContactsContract;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Player;

public class GetPlayerByNameRunnable extends BaseRunnable {

    private final DatabaseCallback<Player> callback;
    private final Context context;
    private String playerNick;

    public GetPlayerByNameRunnable(Context context, DatabaseCallback<Player> callback, String playerNick){
        super(context, callback);
        this.context = context;
        this.callback = callback;
        this.playerNick = playerNick;
    }

    @Override
    public Player query(){
        return RoomDatabaseFactory.db(context).playerDao().getPlayerByNick(playerNick);
    }
}
