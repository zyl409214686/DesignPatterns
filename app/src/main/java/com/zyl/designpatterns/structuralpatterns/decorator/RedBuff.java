package com.zyl.designpatterns.structuralpatterns.decorator;

/**
 * Description: 红buff
 * Created by zouyulong on 2018/1/6.
 */

public class RedBuff extends AbstractAttact {
    public RedBuff(IAttack attack) {
        super(attack);
    }

    @Override
    public void attack() {
        super.attack();
        attackWithBuff();
    }

    private void attackWithBuff(){
        System.out.println("带有红buff的攻击");
    }
}
