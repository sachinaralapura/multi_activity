package com.example.multi_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final  String MSG = "com.example.multi_activity.message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  nextActivity(View view){
//        System.out.println(view.getId());
        Intent intent = new Intent(this,MainActivity2.class);
        EditText editText1 = findViewById(R.id.text1);
        EditText editText2 = findViewById(R.id.text2);
        EditText editText3 = findViewById(R.id.text3);
        String message = "The missile knows no limit";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}