package com.zyl.designpatterns.creationalpatterns.factorymethod;

/**
 * Description: 海鑫活体检测
 * Created by zouyulong on 2017/12/22.
 */

public class HaiXinLivingDetection extends AbstractLivingDetection {
    @Override
    public void startDetection() {
        System.out.println("开启海鑫活体检测");
    }
}
