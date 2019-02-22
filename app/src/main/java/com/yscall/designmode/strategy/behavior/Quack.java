package com.yscall.designmode.strategy.behavior;

import android.util.Log;

import com.yscall.designmode.strategy.base.BaseQuackBehavior;

/**
 * Created by 你的样子 on 2019/2/22.
 * 会叫的鸭子
 *
 * @author gerile
 */

public class Quack implements BaseQuackBehavior {

    @Override
    public void quack() {
        Log.i("==TAG==", "嘎嘎叫");
    }
}
