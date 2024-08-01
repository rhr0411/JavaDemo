package com.mode;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    private List<Observer> observers;

    private float pressure;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o :observers){
            o.update(pressure);
        }
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
}
