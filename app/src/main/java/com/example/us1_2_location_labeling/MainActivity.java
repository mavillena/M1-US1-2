package com.example.us1_2_location_labeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNextClicked(View view) {
        Intent intent = new Intent(this, LabelActivity.class);
        startActivity(intent);
        finish();
    }
}