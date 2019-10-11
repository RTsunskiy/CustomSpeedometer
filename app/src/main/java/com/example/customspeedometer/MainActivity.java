package com.example.customspeedometer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpeedometerProgressView speedometerProgressView = findViewById(R.id.speedometer_progress_view);
        speedometerProgressView.setSpeed(150);
        speedometerProgressView.setMaxSpeed(200);
    }
}
