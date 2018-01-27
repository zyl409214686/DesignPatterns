package com.zyl.designpatterns.structuralpatterns.proxy.staticproxy;

import com.zyl.designpatterns.structuralpatterns.proxy.IShop;

/**
 * Description: 代购类
 * Created by zouyulong on 2018/1/6.
 */

public class BuyProxy implements IShop {

    private IShop mShop;

    public BuyProxy(IShop shop){
        mShop = shop;
    }

    @Override
    public void buy() {
        mShop.buy();
    }
}
