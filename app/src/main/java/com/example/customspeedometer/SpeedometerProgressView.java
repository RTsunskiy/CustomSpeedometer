package com.example.customspeedometer;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;


public class SpeedometerProgressView extends View {

    private int speed;
    private int maxSpeed;
    private int lowSpeedColor;
    private int mediumSpeedColor;
    private int highSpeedColor;
    private int arrowColor;


    private Paint circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint arrowPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private RectF progressRect = new RectF(0, 0, 700, 700);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
      //  canvas.drawArc(progressRect, );
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLowSpeedColor() {
        return lowSpeedColor;
    }

    public void setLowSpeedColor(int lowSpeedColor) {
        this.lowSpeedColor = lowSpeedColor;
    }

    public int getMediumSpeedColor() {
        return mediumSpeedColor;
    }

    public void setMediumSpeedColor(int mediumSpeedColor) {
        this.mediumSpeedColor = mediumSpeedColor;
    }

    public int getHighSpeedColor() {
        return highSpeedColor;
    }

    public void setHighSpeedColor(int highSpeedColor) {
        this.highSpeedColor = highSpeedColor;
    }

    public int getArrowColor() {
        return arrowColor;
    }

    public void setArrowColor(int arrowColor) {
        this.arrowColor = arrowColor;
    }



    public SpeedometerProgressView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
       final Resources.Theme theme = context.getTheme();
       final TypedArray typedArray = theme.obtainStyledAttributes(attrs, R.styleable.SpeedometerProgressView, R.attr.speedometer_progress_style, 0);
    try {
        speed = typedArray.getInteger(R.styleable.SpeedometerProgressView_speed, 0);
        maxSpeed = typedArray.getInteger(R.styleable.SpeedometerProgressView_maxSpeed, 0);
        lowSpeedColor = typedArray.getColor(R.styleable.SpeedometerProgressView_lowSpeedColor, 0);
        mediumSpeedColor = typedArray.getColor(R.styleable.SpeedometerProgressView_mediumSpeedColor, 0);
        highSpeedColor = typedArray.getColor(R.styleable.SpeedometerProgressView_highSpeedColor, 0);
        arrowColor = typedArray.getColor(R.styleable.SpeedometerProgressView_arrowColor, 0);
    } finally {
        typedArray.recycle();
    }

    }
}
