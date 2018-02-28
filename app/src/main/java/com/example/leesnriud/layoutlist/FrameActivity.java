package com.example.leesnriud.layoutlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * android framelayout 帧布局
 *
 * android:foreground  设置该帧布局容器的前景图像
 *
 * android:foregroundGravity 设置前景图像显示的位置
 *
 */
public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }
}
