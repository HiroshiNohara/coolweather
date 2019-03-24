package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    public String type;

    @SerializedName("txt")
    public String info;
}
