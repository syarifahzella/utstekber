package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class materi_intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_intent);
    }

    public void Pindah24(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah25(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-activity-lifecycle-and-state/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah26(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-activity-with-implicit-intent/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah27(View view) {
        Intent intent = new Intent(materi_intent.this, MainActivity.class);
        startActivity(intent);
    }
}
