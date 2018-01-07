package com.zyl.designpatterns.structuralpatterns.decorator;

/**
 * Description: 橘右京
 * Created by zouyulong on 2018/1/6.
 */

public class OrangeYouJing implements IAttack {

    @Override
    public void attack() {
        System.out.println("橘右京削橘子");
    }
}
