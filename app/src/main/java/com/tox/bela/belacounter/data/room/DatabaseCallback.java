package com.tox.bela.belacounter.data.room;

public interface DatabaseCallback<T> {

    void onSuccess(T data);
    void onError(Throwable t);
}
