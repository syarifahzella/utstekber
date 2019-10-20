package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class materi_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_activity);
    }

    public void Pindah12(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=..%2F..android-training")); startActivity(webIntent);

    }

    public void Pindah13(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/index.html?index=..%2F..android-training#4")); startActivity(webIntent);

    }

    public void Pindah14(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-b/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah15(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-text-and-scrolling-views/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah16(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-available-resources/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah17(View view) {
        Intent intent = new Intent(materi_activity.this, MainActivity.class);
        startActivity(intent);
    }
}
