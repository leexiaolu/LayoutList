package com.example.leesnriud.layoutlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 1、基本属性
 * gravity :设置容器内组件的对齐方式
 * ignoreGravity : 设置该属性为true的组件，将不受gravity属性的影响

 * 2、根据父容器定位
 * layout_alignParentLeft : 左对齐
 * layout_alignParenRight : 右对齐
 * layout_alignParentTop : 顶部对齐
 * layout_alignParentButtom : 底部对齐
 * android:layout_centerHorizontal :水平居中
 * android:layout_centerVertical : 垂直居中
 * android:layout_centerInParent : 中间位置

 * 3、根据兄弟组件定位
 * layout_toLeftOf : 参考组件的左边
 * layout_toRightOf: 参考组件的左边
 * layout_above : 参考组件的上方
 * layout_below : 参考组件的下方
 * layout_alignTop ：对齐参考组件的上边界
 * layout_alignBottom : 对齐参考组件的下边界
 * layout_alignLeft: 对齐参考组件的左边界
 * layout_alignRight : 对齐参考组件的右边界

 * 4、margin（偏移）
 * 设置组件与父容器的边界
 * layout_margin 设置组件上下左右的偏移量
 * layout_marginLeft 设置组件离左边的偏移量
 * layout_marginRight 设置组件离右边的偏移量
 * layout_marginTop 设置组件离上面的偏移量
 * layout_marginButtom 设置组件离下面的偏移量

 * 5、padding（填充）
 * 设置组件内部元素间的边距（比如TextView里的字体位置）
 * android:padding 往内部元素的上下左右填充一定边距
 * paddingLeft 往内部元素的左边填充一定边距
 * paddingRight 往内部元素的右方填充一定边距
 * paddingTop 往内部元素的上方填充一定边距
 * paddingBottom 往内部元素的下发填充一定边距
 */
public class RelativeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }
}
