package com.samip.drawonscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // constructing Draw class
        Draw draw = new Draw(this);

        setContentView(draw);

    }
}
