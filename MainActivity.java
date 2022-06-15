package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_Click(View view){
        openActivity2();
    }
    public void openActivity2(){
        Intent intent=new Intent(this,food2.class);
        startActivity(intent);
    }
    public void button1_Click(View view){
    Intent i =new Intent(Intent.ACTION_VIEW,
            Uri.parse("https://www.agriharvest.tw/archives/8628"));
    startActivity(i);
    }
    public void button2_Click(View view){
        Intent i =new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.foodnext.net/news/newsnation/paper/5234310108"));
        startActivity(i);
    }
    public void button3_Click(View view){
        Intent i =new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://e-info.org.tw/node/109472"));
        startActivity(i);
    }
    public void button4_Click(View view){
        Intent i =new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.vogue.com.tw/lifestyle/article/%E5%BE%9E%E5%89%A9%E9%A3%9F%E5%88%B0%E7%BA%8C%E9%A3%9F%E5%8F%AF%E4%BB%A5%E6%8E%A1%E5%8F%96%E7%9A%844%E7%A8%AE%E8%A1%8C%E5%8B%95"));
        startActivity(i);
    }
}