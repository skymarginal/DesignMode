package com.yscall.designmode.strategy.duck;

import android.util.Log;

import com.yscall.designmode.strategy.base.BaseDuck;
import com.yscall.designmode.strategy.behavior.FlyWithWings;
import com.yscall.designmode.strategy.behavior.Quack;

/**
 * Created by 你的样子 on 2019/2/22.
 * 绿头鸭
 *
 * @author gerile
 */

public class MallardDuck extends BaseDuck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        Log.i("==TAG==","我是绿头鸭");
    }
}
