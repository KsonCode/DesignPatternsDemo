package com.designpatternsdemo.Observer.myObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qingchen on 2017/6/17.
 * 服务好，3d服务号实现类
 */

public class ObjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String msg;//3d彩票号码
    @Override
    public void registerObserver(Observer oberver) {

        observers.add(oberver);

    }

    @Override
    public void removeObserver(Observer observer) {

        int index = observers.indexOf(observer);
        if (index>0){
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {

        for (Observer observer:observers
             ) {
            observer.update(msg);
        }

    }

    /**
     * 主题更新消息
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;

        notifyObservers();
    }
}
