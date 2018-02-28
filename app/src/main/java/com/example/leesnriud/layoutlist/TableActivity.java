package com.example.leesnriud.layoutlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * adnroid tablelayout 常用属性

 * android:collapseColumns:设置需要被隐藏的列的序号

 * android:shrinkColumns:设置允许被收缩的列的列序号

 * android:stretchColumns:设置运行被拉伸的列的列序号
 */
public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        //layout中使用了隐藏列 收缩 拉伸 没有示例代码 直接修改就可以
    }
}
