package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 */

public class ObserverImpl implements ObserverDemo {
    @Override
    public void update(String msg) {
        System.out.println("彩票号码-->"+msg);
    }
}
