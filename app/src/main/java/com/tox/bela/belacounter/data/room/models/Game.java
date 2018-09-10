package com.tox.bela.belacounter.data.room.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

@Entity(tableName = "games")
public class Game implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private String _id;

    @ForeignKey(entity = Match.class,
            parentColumns = "_id",
            childColumns = "matchId",
            onDelete = ForeignKey.CASCADE)
    @NonNull
    private String matchId;

    @ColumnInfo(name = "ended")
    private Boolean ended;

    @ColumnInfo(name = "winner")
    private int winner;

    public Game(String matchId){
        this.matchId = matchId;
        this.ended = false;
        this.winner = 0;
    }


    @NonNull
    public String get_id() {
        return _id;
    }

    @NonNull
    public String getMatchId() {
        return matchId;
    }

    public Boolean getEnded() {
        return ended;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }
}
