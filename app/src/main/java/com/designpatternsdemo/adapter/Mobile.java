package com.designpatternsdemo.adapter;

/**
 * Created by qingchen on 2017/6/17.
 * 一部手机 充电功能
 */

public class Mobile {

    public void inputPower(V5Power power){

        int provideV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}