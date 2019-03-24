package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public Update update;
    //public AQI aqi;
    public Now now;
    public List<Suggestion> lifestyle;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
