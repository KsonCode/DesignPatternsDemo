package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/6/17.
 */

public class FactoryImpl extends  Factory{
    @Override
    public <T extends Product> T createFactory(Class<T> cls) {
        Product product = null;
        try {
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
