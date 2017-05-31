package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/5/31.
 * 抽象工程的实现类
 */

public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCarFactory(Class<T> clz) {
        AudiCar audiCar = null;
        try {
            audiCar = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) audiCar;
    }
}
