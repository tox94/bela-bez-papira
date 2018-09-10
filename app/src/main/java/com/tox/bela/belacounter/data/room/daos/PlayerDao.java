package com.tox.bela.belacounter.data.room.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.tox.bela.belacounter.data.room.models.Player;

import java.util.List;

@Dao
public interface PlayerDao {

    @Query("SELECT * FROM players")
    List<Player> getAllPlayers();

    @Query("SELECT * FROM players WHERE _id LIKE :id")
    Player getPlayerById(String id);

    @Query("SELECT * FROM players WHERE nick LIKE :nick")
    Player getPlayerByNick(String nick);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPlayer(Player player);

    @Delete
    void deletePlayer(Player player);
}
