package com.abc919ab1.lab_java_springboot_fundamentals.services;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

@Service
public class TimeService {

    // Get current time
    public String getCurrentTime() {
        return LocalTime.now().toString();
    }

    // Get current date
    public String getCurrentDate() {
        return LocalDate.now().toString(); // format YYYY-MM-DD
    }

    // Get current day of the week
    public String getDayOfWeek() {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        return day.toString(); // e.g., MONDAY
    }
}
