package com.example.intentlifecycle08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnManhinh1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");
        btnManhinh1 = findViewById(R.id.buttonManhinh1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }
}
