package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (Exception e){
            return;
        }
        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String login = extras.getString("login");
            i.putExtra("login",login);
        }
        startActivity(i);
    }
}