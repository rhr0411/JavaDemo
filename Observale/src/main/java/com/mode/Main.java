package com.mode;

import com.mode.example.NaoZhong;
import com.mode.example.XiaoWang;
import com.mode.example.XiaoZhang;

public class Main {
    public static void main(String[] args) {
        NaoZhong naoZhong = new NaoZhong();

        naoZhong.register(new XiaoWang());
        naoZhong.register(new XiaoZhang());

        naoZhong.notifyALL();
    }
}