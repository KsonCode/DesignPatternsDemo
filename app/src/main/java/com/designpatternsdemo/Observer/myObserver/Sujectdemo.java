package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 */

public interface Sujectdemo {
    void registerObserver(ObserverDemo observer);

    void removeObserver(ObserverDemo observer);

    void notifyObservers();
}
