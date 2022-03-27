package com.samsung.weatherapp.model;

public class CurrentResponse {
    public Location location;
    public CurrentWeather current;

    public CurrentResponse() {
    }

    @Override
    public String toString() {
        return "CurrentResponse{" +
                "location=" + location +
                ", current=" + current +
                '}';
    }
}
