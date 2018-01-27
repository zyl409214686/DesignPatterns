package com.zyl.designpatterns.structuralpatterns.proxy.dynamicproxy;

import com.zyl.designpatterns.structuralpatterns.proxy.Customer;
import com.zyl.designpatterns.structuralpatterns.proxy.IShop;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Description: 动态代理设计模式 测试用例
 * Created by zouyulong on 2018/1/27.
 */
public class DynamicBuyProxyTest {
    DynamicBuyProxy mDynamicProxy;
    IShop mCustomer;
    ClassLoader mClassLoader;
    @Before
    public void setUp() throws Exception {
        mCustomer = new Customer();
        mDynamicProxy = new DynamicBuyProxy();
        mDynamicProxy.setShop(mCustomer);
        mClassLoader = mCustomer.getClass().getClassLoader();
    }

    @Test
    public void invoke() throws Exception {
        IShop proxyer = (IShop) Proxy.newProxyInstance(mClassLoader, new Class[]{IShop.class}, mDynamicProxy);
        proxyer.buy();
        System.out.println("proxyer.classname:"+proxyer.getClass().getName());
    }
}