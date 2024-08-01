package com.mode;


import java.util.ArrayList;
import java.util.List;

//被观察者
public interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
