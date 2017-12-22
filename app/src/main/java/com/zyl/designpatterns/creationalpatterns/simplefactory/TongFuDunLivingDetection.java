package com.zyl.designpatterns.creationalpatterns.simplefactory;

/**
 * Description: 通付盾活体检测
 * Created by zouyulong on 2017/12/20.
 */

public class TongFuDunLivingDetection extends AbstractLivingDetection {
    @Override
    public void startDetection() {
        System.out.println("开启通付盾活体检测");
    }
}
