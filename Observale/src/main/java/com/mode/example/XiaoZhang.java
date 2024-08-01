package com.mode.example;

public class XiaoZhang implements Observer{
    @Override
    public void update() {
        System.out.println("收到提醒");
    }
}
