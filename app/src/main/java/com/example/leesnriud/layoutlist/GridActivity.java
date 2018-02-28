package com.example.leesnriud.layoutlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * android gridlayout 网格布局
 * Android4.0推出的，使用要注意sdk版本在14或以上版本
 * android:layout_rowSpan android:layout_columnSpan 设置跨行跨列
 *
 * android:layout_gravity 填满行或列
 *
 */
public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
    }
}
