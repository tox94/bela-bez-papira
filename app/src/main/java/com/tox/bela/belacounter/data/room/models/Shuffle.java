package com.tox.bela.belacounter.data.room.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

@Entity(tableName = "shuffles")
public class Shuffle implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private String _id;

    @ForeignKey(entity = Game.class,
            parentColumns = "_id",
            childColumns = "gameId",
            onDelete = ForeignKey.CASCADE)
    @NonNull
    private String gameId;

    @ColumnInfo(name = "teamOnePoints")
    private int teamOnePoints;

    @ColumnInfo(name = "teamTwoPoints")
    private int teamTwoPoints;

    @ColumnInfo(name = "teamOneCalls")
    private int teamOneCalls;

    @ColumnInfo(name = "teamTwoCalls")
    private int teamTwoCalls;

    public Shuffle(String gameId, int teamOnePoints, int teamTwoPoints, int teamOneCalls, int teamTwoCalls){
        this.gameId = gameId;
        this.teamOnePoints = teamOnePoints;
        this.teamTwoPoints = teamTwoPoints;
        this.teamOneCalls = teamOneCalls;
        this.teamTwoCalls = teamTwoCalls;
    }


    @NonNull
    public String get_id() {
        return _id;
    }

    @NonNull
    public String getGameId() {
        return gameId;
    }

    public int getTeamOnePoints() {
        return teamOnePoints;
    }

    public void setTeamOnePoints(int teamOnePoints) {
        this.teamOnePoints = teamOnePoints;
    }

    public int getTeamTwoPoints() {
        return teamTwoPoints;
    }

    public void setTeamTwoPoints(int teamTwoPoints) {
        this.teamTwoPoints = teamTwoPoints;
    }

    public int getTeamOneCalls() {
        return teamOneCalls;
    }

    public void setTeamOneCalls(int teamOneCalls) {
        this.teamOneCalls = teamOneCalls;
    }

    public int getTeamTwoCalls() {
        return teamTwoCalls;
    }

    public void setTeamTwoCalls(int teamTwoCalls) {
        this.teamTwoCalls = teamTwoCalls;
    }
}
