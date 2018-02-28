package com.example.leesnriud.layoutlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.bt_linear, R.id.bt_relative, R.id.bt_table, R.id.bt_frame, R.id.bt_grid, R.id.bt_absolute})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_linear:
                intent = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_relative:
                intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_table:
                intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_frame:
                intent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_grid:
                intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_absolute:
                intent = new Intent(MainActivity.this,AbsolubeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
