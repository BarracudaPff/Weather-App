package com.samsung.weatherapp.model;

import com.google.gson.annotations.SerializedName;

public class Location {
    public String name;
    public String region;
    public String country;
    public double lat;
    public double lon;
    @SerializedName("tz_id")
    public String tzID;
    @SerializedName("localtime_epoch")
    public long localtimeEpoch;
    public String localtime;

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", tzID='" + tzID + '\'' +
                ", localtimeEpoch=" + localtimeEpoch +
                ", localtime='" + localtime + '\'' +
                '}';
    }
}
