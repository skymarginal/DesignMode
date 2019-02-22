package com.yscall.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yscall.designmode.strategy.StrategyControl;

/**
 * 主页面
 *
 * @author gerile
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mode_strategy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyControl.getInstance().execute();
            }
        });
    }
}
