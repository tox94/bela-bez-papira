package com.tox.bela.belacounter.data.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.tox.bela.belacounter.data.room.daos.GameDao;
import com.tox.bela.belacounter.data.room.daos.MatchDao;
import com.tox.bela.belacounter.data.room.daos.PlayerDao;
import com.tox.bela.belacounter.data.room.daos.ShuffleDao;
import com.tox.bela.belacounter.data.room.models.Game;
import com.tox.bela.belacounter.data.room.models.Match;
import com.tox.bela.belacounter.data.room.models.Player;
import com.tox.bela.belacounter.data.room.models.Shuffle;

@Database(
        entities = {
                Player.class,
                Match.class,
                Game.class,
                Shuffle.class
        },
        version = 1,
        exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PlayerDao playerDao();
    public abstract MatchDao matchDao();
    public abstract GameDao gameDao();
    public abstract ShuffleDao shuffleDao();
}
