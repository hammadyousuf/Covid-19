package com.kashsoftdevelopment.coronavirustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class helplines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helplines);
    }




    public void indiahelpline(View view) {
        startActivity(new Intent(getApplicationContext(), Helpline.class));

    }

    public void kashmirhelpline(View view) {
        startActivity(new Intent(getApplicationContext(), kashmirhelp.class));

    }


}
