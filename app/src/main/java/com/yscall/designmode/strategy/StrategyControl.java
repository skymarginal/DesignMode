package com.yscall.designmode.strategy;

import com.yscall.designmode.strategy.base.BaseDuck;
import com.yscall.designmode.strategy.behavior.FlyRocketPowered;
import com.yscall.designmode.strategy.duck.MallardDuck;
import com.yscall.designmode.strategy.duck.ModelDuck;

/**
 * Created by 你的样子 on 2019/2/22.
 * 策略模式控制器
 *
 * @author gerile
 */

public class StrategyControl {

    private static StrategyControl mInstance;

    public static StrategyControl getInstance() {
        if (mInstance == null) {
            synchronized (StrategyControl.class) {
                if (mInstance == null) {
                    mInstance = new StrategyControl();
                }
            }
        }
        return mInstance;
    }

    public void execute() {
        //绿头鸭
        BaseDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        //模型鸭
        BaseDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();

        //模型鸭具备火箭动力
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
