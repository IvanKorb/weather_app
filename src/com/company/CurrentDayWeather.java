package com.company;

import java.util.Date;

public class CurrentDayWeather extends InfoWeather {
    public Date today;
    CurrentDayWeather(Date today){

        this.today = today;
    }

    public Date getToday() {
        return today;
    }
}
