package com.zyl.designpatterns.structuralpatterns.decorator;

/**
 * Description: 抽象攻击类
 * Created by zouyulong on 2018/1/6.
 */

public abstract class AbstractAttact implements IAttack {
    private IAttack mAttact;

    public AbstractAttact(IAttack attack) {
        mAttact = attack;
    }

    @Override
    public void attack() {
        mAttact.attack();
    }
}
