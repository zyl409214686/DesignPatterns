package com.zyl.designpatterns.creationalpatterns.simplefactory;

/**
 * Description: 活体检测工厂类
 * Created by zouyulong on 2017/12/20.
 */

public class LivingDetectionFactory {
    public static AbstractLivingDetection createLivingDetection(String type){
        AbstractLivingDetection livingDetection = null;
        switch (type){
            case "tongfudun":
                livingDetection = new TongFuDunLivingDetection();
                break;
            case "haixin":
                livingDetection = new HaiXinLivingDetection();
                break;
            default:
                break;
        }
        return  livingDetection;
    }
}
