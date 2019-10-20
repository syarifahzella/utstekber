package com.example.tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class materi_broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_broadcast);
    }

    public void Pindah18(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-clickable-images/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah19(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-input-controls/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah20(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-menus-and-pickers/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah21(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-provide-user-navigation/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah22(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW); webIntent.setData(Uri.parse("https://codelabs.developers.google.com/codelabs/android-training-create-recycler-view/index.html?index=..%2F..android-training#0")); startActivity(webIntent);

    }

    public void Pindah23(View view) {
        Intent intent = new Intent(materi_broadcast.this, MainActivity.class);
        startActivity(intent);
    }
}
