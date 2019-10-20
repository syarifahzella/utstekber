package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, activity.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, intent.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(MainActivity.this, service.class);
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(MainActivity.this, broadcast.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(MainActivity.this, content.class);
        startActivity(intent);
    }

    public void Pindah6(View view) {

    }
}
