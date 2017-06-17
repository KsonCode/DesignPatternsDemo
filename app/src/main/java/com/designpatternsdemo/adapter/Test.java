package com.designpatternsdemo.adapter;

/**
 * Created by qingchen on 2017/6/17.
 */

public class Test {
    public static void main(String[] args){
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
