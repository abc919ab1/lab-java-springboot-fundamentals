package com.abc919ab1.lab_java_springboot_fundamentals.services;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class WeatherService {
    private final Random random = new Random();

    // Get current temperature (-10 to 40)
    public int getTemperature() {
        return random.nextInt(51) - 10; //
    }

    // Get random weather condition
    public String getCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    // Get random wind speed (0-100)
    public int getWindSpeed() {
        return random.nextInt(101);
    }
}
