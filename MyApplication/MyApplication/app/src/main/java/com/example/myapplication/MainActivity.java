package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void validate(View v){
        EditText loginText = findViewById(R.id.editTextTextPersonName);
        String login = loginText.getText().toString();
        EditText passText = findViewById(R.id.editTextTextPassword);
        String pass = passText.getText().toString();

        if(!login.isEmpty() && !pass.isEmpty()){
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("login",login);
            startActivity(i);
        }
    }
}