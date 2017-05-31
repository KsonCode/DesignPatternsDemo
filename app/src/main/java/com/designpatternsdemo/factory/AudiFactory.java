package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/5/31.
 * 奥迪工厂抽象类
 */

public abstract class AudiFactory {

    public abstract <T extends AudiCar> T createAudiCarFactory(Class<T> clz);
}
