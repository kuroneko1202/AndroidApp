package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class food2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);
    }
    public void button5_Click(View view){
        openActivity1();
    }
    public void openActivity1(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void button8_Click(View view){
        openActivity3();
    }
    public void openActivity3(){
        Intent intent=new Intent(this,food3.class);
        startActivity(intent);
    }
    public void button6_Click(View view){
        Intent i =new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/search?q=%E9%99%84%E8%BF%91%E5%89%A9%E9%A3%9F%E9%A4%90%E5%BB%B3&rlz=1C1CHBF_zh-TWTW917TW917&sxsrf=ALiCzsakky0wvjG1H7Uq7zFRbttpx0uqyQ%3A1655300834313&ei=4uKpYo_ZErm12roPo9mgqA0&ved=0ahUKEwiP0uaRzK_4AhW5mlYBHaMsCNUQ4dUDCA4&uact=5&oq=%E9%99%84%E8%BF%91%E5%89%A9%E9%A3%9F%E9%A4%90%E5%BB%B3&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELADECc6BwgAEEcQsANKBAhBGABKBAhGGABQ8wVYzxVgmxloAXABeACAAWCIAccBkgEBM5gBAKABAcgBCsABAQ&sclient=gws-wiz"));
        startActivity(i);
    }
    public void button7_Click(View view){
        Intent i =new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/search/%E9%99%84%E8%BF%91%E5%89%A9%E9%A3%9F%E9%A4%90%E5%BB%B3/@23.1493852,120.0617387,9z"));
        startActivity(i);
    }
}