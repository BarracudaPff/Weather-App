package com.samsung.weatherapp.services;

import com.google.gson.Gson;
import com.samsung.weatherapp.model.CurrentResponse;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class WeatherService {
    private static final String API_KEY = "a037e09934a84dd196e74138222703";
    private static final String BASE_URL = "https://api.weatherapi.com/v1/";

    public static CurrentResponse getCurrentWeather(String city) {
        String url = BASE_URL + "current.json" + "?q=" + city + "&key=" + API_KEY;

        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        System.out.println(url);

        try {
            Call call = client.newCall(request);
            Response response = call.execute();
            ResponseBody responseBody = response.body();
            String s = responseBody.string();

            CurrentResponse currentResponse = gson.fromJson(s, CurrentResponse.class);

            return currentResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
