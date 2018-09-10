package com.tox.bela.belacounter.data.room.runnables;

import android.content.Context;

import com.tox.bela.belacounter.data.room.BaseRunnable;
import com.tox.bela.belacounter.data.room.DatabaseCallback;
import com.tox.bela.belacounter.data.room.RoomDatabaseFactory;
import com.tox.bela.belacounter.data.room.models.Match;
import com.tox.bela.belacounter.data.room.models.Player;

import java.util.List;

public class GetAllMatchesRunnable extends BaseRunnable {

    private final DatabaseCallback<List<Match>> callback;
    private final Context context;

    public GetAllMatchesRunnable(Context context, DatabaseCallback<List<Match>> callback){
        super(context, callback);
        this.context = context;
        this.callback = callback;
    }

    @Override
    public List<Match> query(){
        return RoomDatabaseFactory.db(context).matchDao().getAllMatches();
    }
}
