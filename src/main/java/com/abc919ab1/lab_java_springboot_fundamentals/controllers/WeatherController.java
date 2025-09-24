package com.abc919ab1.lab_java_springboot_fundamentals.controllers;

import com.abc919ab1.lab_java_springboot_fundamentals.services.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    // Constructor injection
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public String getTemperature() {
        return "Temperature: " + weatherService.getTemperature() + "°C";
    }

    @GetMapping("/condition")
    public String getCondition() {
        return "Condition: " + weatherService.getCondition();
    }

    @GetMapping("/wind")
    public String getWind() {
        return "Wind speed: " + weatherService.getWindSpeed() + " km/h";
    }

    @GetMapping("/all")
    public Map<String, Object> getAll() {
        Map<String, Object> weather = new HashMap<>();
        weather.put("temperature", weatherService.getTemperature());
        weather.put("condition", weatherService.getCondition());
        weather.put("wind", weatherService.getWindSpeed());
        return weather;
    }
}
