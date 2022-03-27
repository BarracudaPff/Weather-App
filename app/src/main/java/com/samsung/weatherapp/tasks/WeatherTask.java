package com.samsung.weatherapp.tasks;

import android.os.AsyncTask;

import com.samsung.weatherapp.model.CurrentResponse;
import com.samsung.weatherapp.services.WeatherService;

public class WeatherTask extends AsyncTask<String, Void, CurrentResponse> {
    @Override
    protected CurrentResponse doInBackground(String... strings) {
        String req = strings[0];
        return WeatherService.getCurrentWeather(req);
    }
}
