package com.tox.bela.belacounter.data.room.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

@Entity(tableName = "matches")
public class Match implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private String _id;

    @ForeignKey(entity = Player.class,
            parentColumns = "_id",
            childColumns = "playerOneId",
            onDelete = ForeignKey.CASCADE)
    @NonNull
    private String playerOneId;

    @ForeignKey(entity = Player.class,
            parentColumns = "_id",
            childColumns = "playerTwoId",
            onDelete = ForeignKey.CASCADE)
    @NonNull
    private String playerTwoId;

    @ForeignKey(entity = Player.class,
            parentColumns = "_id",
            childColumns = "playerThreeId",
            onDelete = ForeignKey.CASCADE)
    @NonNull
    private String playerThreeId;

    @ForeignKey(entity = Player.class,
            parentColumns = "_id",
            childColumns = "playerFourId",
            onDelete = ForeignKey.CASCADE)
    @NonNull
    private String playerFourId;

    public Match(String playerOneId, String playerTwoId, String playerThreeId, String playerFourId){
        this.playerOneId = playerOneId;
        this.playerTwoId = playerTwoId;
        this.playerThreeId = playerThreeId;
        this.playerFourId = playerFourId;
    }

    @NonNull
    public String get_id() {
        return _id;
    }

    @NonNull
    public String getPlayerOneId() {
        return playerOneId;
    }

    @NonNull
    public String getPlayerTwoId() {
        return playerTwoId;
    }

    @NonNull
    public String getPlayerThreeId() {
        return playerThreeId;
    }

    @NonNull
    public String getPlayerFourId() {
        return playerFourId;
    }
}
