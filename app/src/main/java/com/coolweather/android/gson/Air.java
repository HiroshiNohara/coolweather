package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Air {
    public BasicAir basic;
    @SerializedName("air_now_city")
    public AQI aqi;
}
