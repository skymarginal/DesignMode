package com.yscall.designmode.strategy.behavior;

import android.util.Log;

import com.yscall.designmode.strategy.base.BaseFlyBehavior;

/**
 * Created by 你的样子 on 2019/2/22.
 * 不会飞的鸭子
 *
 * @author gerile
 */

public class FlyNoWay implements BaseFlyBehavior {

    @Override
    public void flay() {
        Log.i("==TAG==", "不会飞");
    }
}
