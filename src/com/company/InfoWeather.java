package com.company;

public class InfoWeather {
//    используется для хранения информации к какому периоду дня относится прогноз погоды
    public DayPeriod dayPeriod;
//    используется для хранения информации о температуре в указанных период дня
    public int temperature;
//    используется для хранения информации о влажности в указанный период дня
    public int humidity;
//    используется для хранения информации о давлении ртутного столба
    public int pressure;
//    поле для хранения информации о силе ветра (метр в секунду)

    public int windStrength;
//    указывается для хранения информации о направлении ветра
    public WindDirection windDirection;


    public DayPeriod getDayPeriod() {
        return dayPeriod;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWindStrength() {
        return windStrength;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }
}
