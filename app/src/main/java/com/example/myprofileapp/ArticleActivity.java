package com.example.myprofileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ArticleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_activity);

        ImageButton btnProfile = findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(this);

        ImageButton btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_profile:
                Intent firstIntent = new Intent(ArticleActivity.this, ProfileActivity.class);
                startActivity(firstIntent);
                break;
            case R.id.btn_home:
                Intent secondIntent = new Intent(ArticleActivity.this, MainActivity.class);
                startActivity(secondIntent);
                break;
        }
    }
}
