package com.company;

import java.util.Date;

public interface IWeatherInfo {
    CurrentDayWeather weatherInfo(Date date);
}