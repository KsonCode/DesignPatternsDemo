package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 * 主题接口，所有主题必须实现此接口
 */

public interface Subject {

    void registerObserver(Observer oberver);

    void removeObserver(Observer observer);


    void notifyObservers();
}
