package com.abc919ab1.lab_java_springboot_fundamentals.controllers;

import com.abc919ab1.lab_java_springboot_fundamentals.services.TimeService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    public String getTime() {
        return "Time: " + timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return "Date: " + timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return "Day: " + timeService.getDayOfWeek();
    }

    @GetMapping("/all")
    public Map<String, String> getAll() {
        Map<String, String> result = new HashMap<>();
        result.put("time", timeService.getCurrentTime());
        result.put("date", timeService.getCurrentDate());
        result.put("day", timeService.getDayOfWeek());
        return result;
    }
}
