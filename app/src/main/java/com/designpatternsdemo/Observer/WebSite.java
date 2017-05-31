package com.designpatternsdemo.Observer;

import java.util.Observable;

/**
 * Created by qingchen on 2017/5/31.
 * 技术网站 是被观察者角色
 */

public class WebSite extends Observable{

    public void notification(String content){
        //标示状态或者内容发生改变
        setChanged();
        //同志所有观察者
        notifyObservers(content);
    }

}
