package com.designpatternsdemo.Factory2;

/**
 * Created by qingchen on 2017/5/31.
 */

public class FactoryImpl extends Factory {
    @Override
    public <T extends Product> T createFactory(Class<T> clz) {

        Product product = null;

        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
