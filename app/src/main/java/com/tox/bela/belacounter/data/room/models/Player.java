package com.tox.bela.belacounter.data.room.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

@Entity(tableName = "players",
        indices = {@Index(value = {"nick"},
            unique = true)})
public class Player implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private String _id;

    @ColumnInfo(name = "nick")
    private String nick;

    public Player(String nick){
        this.nick = nick;
    }


    public String getNick() {
        return nick;
    }

    @NonNull
    public String get_id() {
        return _id;
    }
}
