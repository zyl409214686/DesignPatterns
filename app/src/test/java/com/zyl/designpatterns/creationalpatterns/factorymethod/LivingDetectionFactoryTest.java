package com.zyl.designpatterns.creationalpatterns.factorymethod;

import org.junit.Test;

/**
 * Description: com.zyl.designpatterns.creationalpatterns.factorymethod
 * Created by zouyulong on 2017/12/22.
 */
public class LivingDetectionFactoryTest {
    @Test
    public void createLivingDetection() throws Exception {
        new LivingDetectionFactory().createLivingDetection(HaiXinLivingDetection.class).startDetection();
        new LivingDetectionFactory().createLivingDetection(TongFuDunLivingDetection.class).startDetection();
    }
}