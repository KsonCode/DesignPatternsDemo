package com.designpatternsdemo.Factory2;

/**
 * Created by qingchen on 2017/5/31.
 */

public class Client {
    public static void main(String[] args){
        Factory factory = new FactoryImpl();
        Yumi yumi = factory.createFactory(Yumi.class);
        yumi.eat();
        yumi.product();
        yumi.sale();
    }
}
