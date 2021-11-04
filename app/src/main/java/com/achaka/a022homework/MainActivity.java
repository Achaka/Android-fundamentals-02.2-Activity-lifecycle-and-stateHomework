package com.achaka.a022homework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String COUNTER_BUNDLE_KEY = "com.achaka.a022homework.COUNTER";
    private int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            mCounter = savedInstanceState.getInt(COUNTER_BUNDLE_KEY);
        }

        TextView counter = findViewById(R.id.counter);
        Button countButton = findViewById(R.id.count_button);

        counter.setText(String.valueOf(mCounter));

        countButton.setOnClickListener(
                view -> counter.setText(String.valueOf(++mCounter)));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER_BUNDLE_KEY, mCounter);
    }
}