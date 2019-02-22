package com.yscall.designmode.strategy.base;

/**
 * Created by 你的样子 on 2019/2/22.
 * 基础鸭子
 *
 * @author gerile
 */

public abstract class BaseDuck {

    protected BaseFlyBehavior flyBehavior;
    protected BaseQuackBehavior quackBehavior;

    public void setFlyBehavior(BaseFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(BaseQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 鸭子介绍
     */
    public abstract void display();

    /**
     * 鸭子飞
     */
    public void performFly() {
        flyBehavior.flay();
    }

    /**
     * 鸭子叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

}
