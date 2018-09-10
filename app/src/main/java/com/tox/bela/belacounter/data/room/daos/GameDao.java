package com.tox.bela.belacounter.data.room.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.tox.bela.belacounter.data.room.models.Game;
import com.tox.bela.belacounter.data.room.models.Match;

import java.util.List;

@Dao
public interface GameDao {

    @Query("SELECT * FROM games WHERE matchId LIKE :matchId")
    List<Game> getGamesByMatchId(String matchId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertGame(Game game);

    @Delete
    void deleteGame(Game game);
}
