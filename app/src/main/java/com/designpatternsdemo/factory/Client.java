package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/5/31.
 *  抽象工厂测试类
 */

public class Client {
    public static void main(String[] args){

//        /**
//         * 抽象工厂测试
//         */
//        AudiFactory factory = new AudiCarFactory();
//        AudiQ3 audiQ3 = factory.createAudiCarFactory(AudiQ3.class);
//        audiQ3.drive();
//        audiQ3.selfNavigation();
//
//        AudiQ5 audiQ5 = factory.createAudiCarFactory(AudiQ5.class);
//        audiQ5.drive();
//        audiQ5.selfNavigation();

        Factory factory = new FactoryImpl();
        Mobile mobile = factory.createFactory(Mobile.class);
        mobile.product();
        mobile.sale();

    }
}
