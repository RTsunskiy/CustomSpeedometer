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
        speedometerProgressView.setSpeed(200);
        speedometerProgressView.setMaxSpeed(240);
//        if (speedometerProgressView.getSpeed() <= 50) {
//            speedometerProgressView.setLowSpeedColor(getResources().getColor(R.color.colorLowSpeed));
//        }
//        else if (speedometerProgressView.getSpeed() > 50 && speedometerProgressView.getSpeed() <= 100) {
//            speedometerProgressView.setMediumSpeedColor(getResources().getColor(R.color.colorMediumSpeed));
//        }
//        else if (speedometerProgressView.getSpeed() > 100) {
//            speedometerProgressView.setHighSpeedColor(R.color.colorHighSpeed);
//        }
    }
}
