package com.example.customspeedometer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SpeedometerProgressView speedometerProgressView;
    SeekBar speedSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speedometerProgressView = findViewById(R.id.speedometer_progress_view);
        speedometerProgressView.setSpeed(150);
        speedometerProgressView.setMaxSpeed(200);

        speedSeekBar = findViewById(R.id.seekBar);

        speedSeekBar.setMax(speedometerProgressView.getMaxSpeed());

        speedSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
           speedometerProgressView.setSpeed(progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
