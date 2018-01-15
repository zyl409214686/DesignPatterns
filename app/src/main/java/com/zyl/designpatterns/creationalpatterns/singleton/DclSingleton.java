package com.zyl.designpatterns.creationalpatterns.singleton;

/**
 * Description: 双重检查单例模式
 * Created by zouyulong on 2018/1/15.
 */

public class DclSingleton {
    private volatile static DclSingleton mInstance = null;
    public static DclSingleton getInstance(){
        if(mInstance==null){
            synchronized (DclSingleton.class){
                if(mInstance==null){
                    mInstance = new DclSingleton();
                }
            }
        }
        return mInstance;
    }
}
