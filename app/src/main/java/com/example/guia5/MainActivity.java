package com.example.guia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void OnclickConversation(View v){
        Intent i = new Intent(this, Conversations.class);
        startActivity(i);
    }

    public void OnclickLogin(View v){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }

    public void OnclickCalculadora(View v){
        Intent i = new Intent(this, Calculadora.class);
        startActivity(i);
    }
}
