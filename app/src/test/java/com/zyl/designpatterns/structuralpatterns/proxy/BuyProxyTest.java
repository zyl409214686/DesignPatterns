package com.zyl.designpatterns.structuralpatterns.proxy;

import org.junit.Before;
import org.junit.Test;

/**
 * Description: 代理模式单元测试
 * Created by zouyulong on 2018/1/6.
 */
public class BuyProxyTest {
    private Customer mCustomer;
    private BuyProxy mBuyProxy;
    @Before
    public void setUp() throws Exception {
        mCustomer = new Customer();
        mBuyProxy = new BuyProxy(mCustomer);
    }

    @Test
    public void buy() throws Exception {
        mBuyProxy.buy();
    }

}