package com.example.a13272.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.util.Log;

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newone);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String data = "你好，第二个测试页面！";
                Intent intent = new Intent(NewActivity.this, Main2Activity.class);
                //intent.putExtra("extra_data", data);
                //intent.setData(Uri.parse("http://jw.cdu.edu.cn"));
                startActivityForResult(intent, 1);
                //Toast.makeText(NewActivity.this, "你点了一下这个按钮！", Toast.LENGTH_SHORT).show();
                //finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       switch (requestCode) {
           case 1:
               if (resultCode == RESULT_OK) {
                   String returnedData = data.getStringExtra("data_return");
                   Log.d("NewActivity", returnedData);
               }
               break;
           default:
       }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())   {
            case R.id.add_item:
                Toast.makeText(this, "你点击了ADD按钮！", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你点击了Remove按钮", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
