package com.designpatternsdemo.Observer;

/**
 * Created by qingchen on 2017/5/31.
 */

public class Client {
    public static void main(String [] args){
        WebSite webSite = new WebSite();
        Coder coder = new Coder("码农1");
        Coder coder2 = new Coder("码农2");
        Coder coder3 = new Coder("码农3");
        Coder coder4 = new Coder("码农4");
        Coder coder5 = new Coder("码农5");

        webSite.addObserver(coder);
        webSite.addObserver(coder2);
        webSite.addObserver(coder3);
        webSite.addObserver(coder4);
        webSite.addObserver(coder5);
        webSite.notification("新一期的文章");
    }
}
