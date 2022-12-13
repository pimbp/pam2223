package com.example.logform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validate(View v){
         EditText mailText = findViewById(R.id.editTextTextEmailAddress);
         String mail = mailText.getText().toString();
         TextView result = findViewById(R.id.comText);
         EditText pass1 = findViewById(R.id.editTextTextPassword);
         EditText pass2 = findViewById(R.id.editTextTextPassword2);
         if(!mail.contains("@")){
            result.setText("Nieprawidłowy adres e-mail");
            return;
         }
         if(!pass1.getText().toString().equals(pass2.getText().toString())){
             result.setText("Hasła się różnią");
             return;
         }
         result.setText("Witaj " + mail);
    }
}