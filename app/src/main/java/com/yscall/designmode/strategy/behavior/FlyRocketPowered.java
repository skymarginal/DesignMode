package com.yscall.designmode.strategy.behavior;

import android.util.Log;

import com.yscall.designmode.strategy.base.BaseFlyBehavior;

/**
 * Created by 你的样子 on 2019/2/22.
 * 火箭动力
 *
 * @author gerile
 */

public class FlyRocketPowered implements BaseFlyBehavior {

    @Override
    public void flay() {
        Log.i("==TAG==", "我具备了火箭动力");
    }
}
