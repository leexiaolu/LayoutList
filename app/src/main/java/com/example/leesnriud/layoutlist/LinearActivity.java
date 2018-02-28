package com.example.leesnriud.layoutlist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * LinearLayout 一些属性
 *
 * orientation 方向
 * 控制LinearLayout的子控件内部具体的排列顺序，还需要android:layout_gtavity这个属性
 * 当orientation为vertical时，子控件设置android:layout_gravity="center_vertical"或者自身设置android:gravity="center_vertical"是无效的。
 * 同样当orientation为honrizontal时，子控件设置android:layout_gravity="center_horizontal"或者自身设置android:gravity="center_honizontal"是无效的。
 *
 * weight 权重
 *
 * 基线 分割线
 */
public class LinearActivity extends AppCompatActivity {

    @BindView(R.id.bt_orientation)
    Button btOrientation;
    @BindView(R.id.linear)
    LinearLayout linear;

    private boolean BLOG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        ButterKnife.bind(this);
    }

    @SuppressLint("WrongConstant")
    @OnClick(R.id.bt_orientation)
    public void onViewClicked() {
        if(BLOG){
            linear.setOrientation(1);// 1 代表纵向
            btOrientation.setText("vertical");
            BLOG = false;
        }else{
            linear.setOrientation(0);// 0 代表横向
            btOrientation.setText("horizontal");
            BLOG = true;
        }
    }
}
