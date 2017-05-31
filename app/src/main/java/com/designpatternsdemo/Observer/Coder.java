package com.designpatternsdemo.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by qingchen on 2017/5/31.
 * 观察者 程序员，观察一个技术网站
 * Observer 是java内置接口
 */

public class Coder  implements Observer{
    public String name;//程序员名字
    public Coder(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi "+name+"，如下内容："+arg+"更新啦");
    }
}
