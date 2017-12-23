package com.zyl.designpatterns.creationalpatterns.factorymethod;

/**
 * Description: com.zyl.designpatterns.creationalpatterns.factorymethod
 * Created by zouyulong on 2017/12/22.
 */

public abstract class AbstractLivingDetectionFactory {
    public abstract <T extends AbstractLivingDetection> T createLivingDetection(Class<T> t);
}
