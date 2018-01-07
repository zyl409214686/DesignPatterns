package com.zyl.designpatterns.structuralpatterns.proxy;

/**
 * Description: 顾客
 * Created by zouyulong on 2018/1/6.
 */

public class Customer implements IShop {
    @Override
    public void buy() {
        System.out.print("顾客购物");
    }
}
