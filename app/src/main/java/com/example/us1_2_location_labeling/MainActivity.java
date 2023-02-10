package com.example.us1_2_location_labeling;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applyCoordinates();

    }

    @Override
    protected void onDestroy() {
        saveCoordinates();
        super.onDestroy();

    }

    public void onNextClicked(View view) {
        Intent intent = new Intent(this, LabelActivity.class);
        startActivity(intent);
        finish();
    }

    public void saveCoordinates() {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        EditText myCoords = findViewById(R.id.personalHomeEditTextBox);
        EditText familyCoords = findViewById(R.id.familyHomeEditTextBox);
        EditText friendCoords = findViewById(R.id.friendsHomeEditTextBox);

        String mine = myCoords.getText().toString();
        String family = familyCoords.getText().toString();
        String friend = friendCoords.getText().toString();

        editor.putString("myCoords", myCoords.getText().toString());
        editor.putString("familyCoords", familyCoords.getText().toString());
        editor.putString("friendsCoords", friendCoords.getText().toString());

        editor.apply();
    }

    public void applyCoordinates() {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        EditText myCoords = findViewById(R.id.personalHomeEditTextBox);
        EditText familyCoords = findViewById(R.id.familyHomeEditTextBox);
        EditText friendCoords = findViewById(R.id.friendsHomeEditTextBox);

        String mine = preferences.getString("myCoords", "");
        String family = preferences.getString("familyCoords", "");
        String friend = preferences.getString("friendCoords", "");

        myCoords.setText(mine);
        familyCoords.setText(family);
        friendCoords.setText(friend);
    }
}