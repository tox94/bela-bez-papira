package com.tox.bela.belacounter.data.room.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.tox.bela.belacounter.data.room.models.Game;
import com.tox.bela.belacounter.data.room.models.Shuffle;

import java.util.List;

@Dao
public interface ShuffleDao {

    @Query("SELECT * FROM shuffles WHERE gameId LIKE :gameId")
    List<Shuffle> getShufflesByGameId(String gameId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertShuffle(Shuffle shuffle);

    @Delete
    void deleteShuffle(Shuffle shuffle);
}
