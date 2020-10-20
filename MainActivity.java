package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText textview1, textview2;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = findViewById(R.id.editTextTextPersonName);
        textview2 = findViewById(R.id.editTextTextPassword2);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
    }
    public void login(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("username",textview1.getText().toString());
        intent.putExtra("password",textview2.getText().toString());
        startActivity(intent);



    }
    public void forgot(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);

    }
}