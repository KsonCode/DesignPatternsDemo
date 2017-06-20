package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 */

public class Test {

    public static void main(String [] args){
        ObjectFor3D objectFor3D = new ObjectFor3D();
        Observer1 observer1 = new Observer1(objectFor3D);
        Observer2 observer2 = new Observer2();
        objectFor3D.registerObserver(observer2);
        objectFor3D.setMsg("45455545454554");

    }
}
