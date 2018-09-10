package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Game;

public class DeleteGameRunnable extends BaseRunnable {

    private DatabaseCallback<Void> callback;
    private final Context context;
    private final Game game;

    public DeleteGameRunnable(Context context, Game game, DatabaseCallback<Void> callback){
        super(context, callback);
        this.context = context;
        this.game = game;
        this.callback = callback;
    }

    @Override
    public Void query(){
        RoomDatabaseFactory.db(context).gameDao().deleteGame(game);
        return null;
    }
}
