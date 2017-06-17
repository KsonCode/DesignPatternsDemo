package com.designpatternsdemo.Observer.myObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qingchen on 2017/6/17.
 */

public class SujectImpl implements Sujectdemo {
    List<ObserverDemo> observerDemos = new ArrayList<>();
    private String msg;
    @Override
    public void registerObserver(ObserverDemo observer) {
        observerDemos.add(observer);

    }

    @Override
    public void removeObserver(ObserverDemo observer) {
        int index = observerDemos.indexOf(observer);
        System.out.println("index-->"+index);
        if (index>=0){
            observerDemos.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {
        for (ObserverDemo observer:observerDemos
             ) {
            observer.update(msg);
        }

    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
