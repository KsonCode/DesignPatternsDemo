package com.designpatternsdemo.Factory2;

/**
 * Created by qingchen on 2017/5/31.
 */

public class Yumi extends Product {

    @Override
    public void product() {
        System.out.println("生产玉米");
    }

    @Override
    public void eat() {

        System.out.println("吃玉米");

    }

    @Override
    public void sale() {

        System.out.println("卖玉米");

    }
}
