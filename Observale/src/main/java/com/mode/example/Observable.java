package com.mode.example;

public interface Observable {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyALL();
}
