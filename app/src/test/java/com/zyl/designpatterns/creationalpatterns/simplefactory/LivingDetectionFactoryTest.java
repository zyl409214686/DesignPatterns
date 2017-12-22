package com.zyl.designpatterns.creationalpatterns.simplefactory;

import org.junit.Test;

/**
 * Description: com.zyl.designpatterns.creationalpatterns.simplefactory
 * Created by zouyulong on 2017/12/20.
 */
public class LivingDetectionFactoryTest {
    @Test
    public void createLivingDetection() throws Exception {
        AbstractLivingDetection haixinSdk = LivingDetectionFactory.createLivingDetection("haixin");
        AbstractLivingDetection tongfudunSdk = LivingDetectionFactory.createLivingDetection("tongfudun");
        haixinSdk.startDetection();
        tongfudunSdk.startDetection();

    }
}