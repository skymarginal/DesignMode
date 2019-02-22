package com.yscall.designmode.strategy.duck;

import android.util.Log;

import com.yscall.designmode.strategy.base.BaseDuck;
import com.yscall.designmode.strategy.behavior.FlyNoWay;
import com.yscall.designmode.strategy.behavior.MuteQuack;

/**
 * Created by 你的样子 on 2019/2/22.
 * 模型鸭
 *
 * @author gerile
 */

public class ModelDuck extends BaseDuck {

    public ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        Log.i("==TAG==", "我是模型鸭");
    }
}
