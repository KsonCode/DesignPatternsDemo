package com.designpatternsdemo.Observer.myObserver;

/**
 * Created by qingchen on 2017/6/17.
 * 所有观察者需要实现此接口
 */

public interface Observer {

    void update(String msg);
}
