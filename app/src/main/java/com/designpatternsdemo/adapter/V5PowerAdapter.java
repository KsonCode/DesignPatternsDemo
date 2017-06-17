package com.designpatternsdemo.adapter;

/**
 * Created by qingchen on 2017/6/17.
 */

public class V5PowerAdapter implements V5Power {
    private V220Power v220Power;


    public V5PowerAdapter(V220Power v220Power){
        this.v220Power = v220Power;

    }

    @Override
    public int provideV5Power() {

        int power = v220Power.provideV220Power();
        //dosomething
        power = 5;
        System.out.println("适配器：我悄悄滴适配了电压");
        return power;
    }
}
