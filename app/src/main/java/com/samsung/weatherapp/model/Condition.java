package com.samsung.weatherapp.model;

public class Condition {
    public String text;
    public String icon;
    public int code;

    public Condition() {
    }

    @Override
    public String toString() {
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code=" + code +
                '}';
    }
}
