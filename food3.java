package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class food3 extends AppCompatActivity {
    private TextView textView;
    public String str="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);
    }
    public void button9_Click(View view){
        openActivity2();
    }
    public void openActivity2(){
        Intent intent=new Intent(this,food2.class);
        startActivity(intent);
    }
    public void button_Click11(View view){
        EditText Date = (EditText) findViewById(R.id.editTextDate);
        EditText Number =(EditText) findViewById(R.id.editTextNumber);
        String Date1 = Date.getText().toString();
        String Number1 = Number.getText().toString();

        RadioGroup type= (RadioGroup)findViewById(R.id.RG1);
        if (type.getCheckedRadioButtonId()==R.id.radioButton)
            str +="日期:"+Date1+"份量:"+Number1+"飯\n";
        else if (type.getCheckedRadioButtonId()==R.id.radioButton1)
            str +="日期:"+Date1+"份量:"+Number1+"麵\n";
        else if (type.getCheckedRadioButtonId()==R.id.radioButton2)
            str +="日期:"+Date1+"份量:"+Number1+"飯\n";
        else if (type.getCheckedRadioButtonId()==R.id.radioButton3)
            str +="日期:"+Date1+"份量:"+Number1+"水果\n";
        else
            str +="日期:"+Date1+"份量:"+Number1+"飲料\n";


        TextView output=(TextView) findViewById(R.id.textView4);
        output.setText(str);
    }
}