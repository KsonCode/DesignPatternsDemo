package com.designpatternsdemo.factory;

/**
 * Created by qingchen on 2017/6/17.
 */

public abstract class Factory {
    public abstract  <T extends Product> T createFactory(Class<T> cls);
}
