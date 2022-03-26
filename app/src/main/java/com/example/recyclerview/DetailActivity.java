package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageDetail = findViewById(R.id.ic_detail);
        TextView textDetail = findViewById(R.id.text_detail);

        Intent intent = getIntent();

        int iconAplikasi = intent.getIntExtra("GAMBAR_DEFAULT", 0);
        String namaAplikasi = intent.getStringExtra("TEXT_DEFAULT");

        imageDetail.setImageResource(iconAplikasi);
        textDetail.setText(namaAplikasi);


    }
}