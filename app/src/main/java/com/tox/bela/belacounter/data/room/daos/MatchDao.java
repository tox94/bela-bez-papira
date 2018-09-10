package com.tox.bela.belacounter.data.room.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.tox.bela.belacounter.data.room.models.Match;
import com.tox.bela.belacounter.data.room.models.Player;

import java.util.List;

@Dao
public interface MatchDao {

    @Query("SELECT * FROM matches")
    List<Match> getAllMatches();

    @Query("SELECT * FROM matches WHERE _id LIKE :id")
    Match getMatchById(String id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMatch(Match match);

    @Delete
    void deleteMatch(Match match);
}
