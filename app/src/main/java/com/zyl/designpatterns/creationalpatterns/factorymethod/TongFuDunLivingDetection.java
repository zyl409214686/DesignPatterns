package com.zyl.designpatterns.creationalpatterns.factorymethod;

/**
 * Description: 通付盾活体检测
 * Created by zouyulong on 2017/12/22.
 */

public class TongFuDunLivingDetection extends AbstractLivingDetection {
    @Override
    public void startDetection() {
        System.out.println("开启通付盾活体检测");
    }
}
