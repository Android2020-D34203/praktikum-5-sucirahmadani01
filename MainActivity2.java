package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    TextView textusername, textpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textusername = findViewById(R.id.user);
        textpassword = findViewById(R.id.password);
        Intent intent = getIntent();
        String User = getIntent().getExtras().getString("username");
        String Password = getIntent().getExtras().getString("password");
        textusername.setText("Username : " + User);
        textpassword.setText("Password : " + Password);
    }
}