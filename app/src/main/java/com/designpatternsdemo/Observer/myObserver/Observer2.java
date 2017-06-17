package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 */

public class Observer2 implements Observer {


    @Override
    public void update(String msg) {

        System.out.println("observer2 拿到彩票号码："+msg);

    }
}
