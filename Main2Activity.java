package com.example.a13272.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "你好，这是来自第一个页面的返回数据！");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        /*Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("MainActivity", data);*/
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "你好，第一个测试页面！");
        setResult(RESULT_OK, intent);
        finish();
    }
}
