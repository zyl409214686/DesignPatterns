package com.zyl.designpatterns.structuralpatterns.decorator;

import org.junit.Before;
import org.junit.Test;

/**
 * Description: 装饰者模式单元测试
 * Created by zouyulong on 2018/1/6.
 */
public class DecoratorTest {
    private OrangeYouJing mOrangeYouJing;
    private RedBuff mRedBuff;
    private BlueBuff mBlueBuff;
    @Before
    public void setUp() throws Exception {
        mOrangeYouJing = new OrangeYouJing();
        mRedBuff = new RedBuff(mOrangeYouJing);
        mBlueBuff = new BlueBuff(mOrangeYouJing);
    }

    @Test
    public void attack() throws Exception {
        mRedBuff.attack();
        mBlueBuff.attack();
    }

}