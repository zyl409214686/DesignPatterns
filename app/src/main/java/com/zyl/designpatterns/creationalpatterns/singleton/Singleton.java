package com.zyl.designpatterns.creationalpatterns.singleton;

/**
 * Description: 创建型模式--静态内部类，单例模式
 * Created by zouyulong on 2017/12/19.
 * Phone : 15810880928
 */

public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
