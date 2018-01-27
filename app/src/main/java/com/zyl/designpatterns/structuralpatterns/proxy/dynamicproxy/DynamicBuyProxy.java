package com.zyl.designpatterns.structuralpatterns.proxy.dynamicproxy;

import com.zyl.designpatterns.structuralpatterns.proxy.IShop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description: com.zyl.designpatterns.structuralpatterns.proxy.dynamicproxy
 * Created by zouyulong on 2018/1/27.
 */

public class DynamicBuyProxy implements InvocationHandler {
    IShop shop;

    public DynamicBuyProxy setShop(IShop shop) {
        this.shop = shop;
        return this;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object resutl = method.invoke(shop, args);
        if("buy".equals(method.getName())){
            System.out.println("---通过动态代理购买---");
        }
        return null;
    }
}
