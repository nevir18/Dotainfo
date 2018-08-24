package com.example.android.dotainfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FrontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

    }

    public void tapscreen(View view) {
        Intent i = new Intent(FrontActivity.this, DotaplayersActivity.class);
        startActivity(i);

    }
    public void tapscreen1(View view) {
        Intent i = new Intent(FrontActivity.this, DotamatchesActivity.class);
        startActivity(i);

    }
}