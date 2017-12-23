package com.zyl.designpatterns.creationalpatterns.factorymethod;

/**
 * Description: 基于反射的活体检测工厂类
 * Created by zouyulong on 2017/12/22.
 */

public class LivingDetectionFactory extends AbstractLivingDetectionFactory {

    @Override
    public <T extends AbstractLivingDetection>T createLivingDetection(Class<T> t){
        try {
            return  t.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
