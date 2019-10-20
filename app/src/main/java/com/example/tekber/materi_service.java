package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class materi_service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_service);
    }

    public void Pindah28(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-using-debugger/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah29(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-unit-tests/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah30(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-support-libraries/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah31(View view) {
        Intent intent = new Intent(materi_service.this, MainActivity.class);
        startActivity(intent);
    }
}
