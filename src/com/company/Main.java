package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date date = new Date();
        WeatherInfo info = new WeatherInfo();

        CurrentDayWeather weather = info.weatherInfo(date);
        //рандомный период дня
        DayPeriod randomPeriod = DayPeriod.values()[(int)(Math.random()*DayPeriod.values().length)];
        //рандомный ветер
        WindDirection randomWind = WindDirection.values()[(int)(Math.random()*WindDirection.values().length)];
        weather.dayPeriod = randomPeriod;
        weather.temperature = (int)(Math.random()*(-40));
        weather.humidity = (int)(Math.random()*90)+10;
        weather.pressure = (int)(Math.random()*100)+700;
        weather.windStrength = (int)(Math.random()*20);
        weather.windDirection = randomWind;



        info.printWeather(weather);
    }
}
