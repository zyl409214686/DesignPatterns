package com.zyl.designpatterns.structuralpatterns.proxy;

import com.zyl.designpatterns.structuralpatterns.proxy.staticproxy.BuyProxy;

import org.junit.Before;
import org.junit.Test;

/**
 * Description: 代理模式单元测试
 * Created by zouyulong on 2018/1/6.
 */
public class BuyProxyTest {
    private IShop mCustomer;
    private BuyProxy mBuyProxy;
    @Before
    public void setUp() throws Exception {
        mCustomer = new Customer();
        mBuyProxy = new BuyProxy(mCustomer);
    }

    @Test
    public void buyForStatic() throws Exception {
        mBuyProxy.buy();
    }
}