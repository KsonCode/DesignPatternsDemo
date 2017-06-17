package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/6/17.
 */

public class Mobile extends Product {
    @Override
    void product() {
        System.out.println("生产手机");

    }

    @Override
    void sale() {

        System.out.println("卖个好价钱");

    }
}
