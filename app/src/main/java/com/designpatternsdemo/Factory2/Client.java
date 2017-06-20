package com.designpatternsdemo.Factory2;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.SystemClock;
import android.view.textservice.TextServicesManager;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

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


        System.out.println(5454545);
    }
}
