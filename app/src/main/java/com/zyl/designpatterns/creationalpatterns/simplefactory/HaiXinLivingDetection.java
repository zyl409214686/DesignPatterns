package com.zyl.designpatterns.creationalpatterns.simplefactory;

/**
 * Description: 海鑫活体检测
 * Created by zouyulong on 2017/12/20.
 */

public class HaiXinLivingDetection extends AbstractLivingDetection {
    @Override
    public void startDetection() {
        System.out.println("开启海鑫活体检测");
    }
}
