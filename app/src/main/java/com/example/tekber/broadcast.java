package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    public void Pindah8(View view) {
        Intent intent = new Intent(broadcast.this, materi_broadcast.class);
        startActivity(intent);
    }
}
