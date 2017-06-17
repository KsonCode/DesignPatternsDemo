package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 */

public class Test {

    public static void main(String [] args){
//        ObjectFor3D objectFor3D = new ObjectFor3D();
//        Observer1 observer1 = new Observer1(objectFor3D);
//        Observer2 observer2 = new Observer2();
//        objectFor3D.registerObserver(observer2);
//        objectFor3D.setMsg("45455545454554");

        SujectImpl suject = new SujectImpl();
        ObserverImpl i1 = new ObserverImpl();
        ObserverImpl i2 = new ObserverImpl();
        suject.registerObserver(i1);
        suject.registerObserver(i2);


        suject.removeObserver(i1);
        suject.removeObserver(i2);
        suject.setMsg("2123658975");
    }
}
