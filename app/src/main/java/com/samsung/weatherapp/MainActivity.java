package com.samsung.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.samsung.weatherapp.model.CurrentResponse;
import com.samsung.weatherapp.services.WeatherService;
import com.samsung.weatherapp.tasks.WeatherTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherTask task = new WeatherTask();

                task.execute("Moscow");

                try {
                    CurrentResponse res = task.get(10, TimeUnit.SECONDS);
                    System.out.println(res);
                    textView.setText(res.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Err");
                }
            }
        });
    }

    void initViews() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }
}