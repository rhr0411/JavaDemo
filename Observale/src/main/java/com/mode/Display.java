package com.mode;

public class Display implements Observer{

    private float pressure;

    private Observable observable;

    public Display(Observable observable){
        this.observable=observable;
        observable.registerObserver(this);
    }

    @Override
    public void update(float pressure) {
        this.pressure=pressure;
        display();
    }

    public void display(){
        System.out.println(pressure);
    }
}
