package com.mode.example;

import java.util.ArrayList;
import java.util.List;

public class NaoZhong implements Observable{

    private List<Observer> list=new ArrayList<>();

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyALL() {
        for(Observer o :list){
            o.update();
        }
    }
}
