package com.mode.example;

public class XiaoWang implements Observer{
    @Override
    public void update() {
        System.out.println("收到提醒");
    }
}
