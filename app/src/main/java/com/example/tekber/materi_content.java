package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class materi_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_content);
    }

    public void Pindah32(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-drawables-styles-and-themes/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah33(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-cards-and-colors/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah34(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-adaptive-layouts/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah35(View view) {
        Intent intent = new Intent(materi_content.this, MainActivity.class);
        startActivity(intent);
    }
}
