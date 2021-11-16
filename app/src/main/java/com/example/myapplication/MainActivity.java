package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private Numbers numbers;
private TextView text_enter;
private TextView text_rezult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers=new Numbers();
initView();
    }

    private void initView() {
    text_enter=findViewById(R.id.tv_enter_number);
    text_rezult=findViewById(R.id.rezult);
    initButton();
    }

    private void initButton() {
    }

}