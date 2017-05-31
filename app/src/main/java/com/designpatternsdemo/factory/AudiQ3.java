package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/5/31.
 */

public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("我是 q3，出发咯");
    }

    @Override
    public void selfNavigation() {

        System.out.println("我是 q3 自动巡航咯");

    }
}
