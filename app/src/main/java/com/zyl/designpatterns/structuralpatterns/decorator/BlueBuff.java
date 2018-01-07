package com.zyl.designpatterns.structuralpatterns.decorator;

/**
 * Description: 蓝buff
 * Created by zouyulong on 2018/1/6.
 */

public class BlueBuff extends AbstractAttact {
    public BlueBuff(IAttack attack) {
        super(attack);
    }

    @Override
    public void attack() {
        super.attack();
        attackWithBuff();
    }

    private void attackWithBuff(){
        System.out.println("带有蓝buff的攻击");
    }
}
