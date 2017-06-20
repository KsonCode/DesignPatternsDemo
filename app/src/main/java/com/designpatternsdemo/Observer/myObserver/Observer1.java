package com.designpatternsdemo.Observer.myObserver;

import android.os.SystemClock;

/**
 * Created by qingchen on 2017/6/17.
 */

public class Observer1 implements Observer {


    public Observer1(Subject subject){
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println("obsever1 得到的彩票号码是"+msg);
    }
}
