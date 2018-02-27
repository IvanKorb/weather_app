package com.company;

import java.util.Date;

public class WeatherInfo implements IPrintWeatherInfo,IWeatherInfo{
    @Override
    public void printWeather(CurrentDayWeather weatherInfo){
        System.out.println("Дата: " + weatherInfo.getToday());
        System.out.println("Время дня: " + weatherInfo.getDayPeriod());
        System.out.println("Температура: " + weatherInfo.getTemperature() +" по Цельсию");
        System.out.println("Влажность: " + weatherInfo.getHumidity() + " %");
        System.out.println("Давление: " + weatherInfo.getPressure() + " мм.рт.ст");
        System.out.println("Направление ветра: " + weatherInfo.getWindDirection());
        System.out.println("Сила ветра: " + weatherInfo.getWindStrength() + " м/с");
    }
    @Override
    public CurrentDayWeather weatherInfo(Date date){
        CurrentDayWeather weather = new CurrentDayWeather(date);
        return weather;
    }
}
