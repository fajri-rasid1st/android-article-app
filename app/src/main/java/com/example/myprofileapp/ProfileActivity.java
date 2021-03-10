package com.example.myprofileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        ImageButton btnArticle = findViewById(R.id.btn_article);
        btnArticle.setOnClickListener(this);

        ImageButton btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_home:
                Intent firstIntent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(firstIntent);
                break;
            case R.id.btn_article:
                Intent secondIntent = new Intent(ProfileActivity.this, ArticleActivity.class);
                startActivity(secondIntent);
                break;
        }
    }
}
