package com.designpatternsdemo.Factory2;

/**
 * Created by qingchen on 2017/5/31.
 */

public abstract class Factory {
    public abstract <T extends Product> T createFactory(Class<T> clz);
}
