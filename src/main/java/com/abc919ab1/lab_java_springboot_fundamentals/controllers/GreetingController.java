package com.abc919ab1.lab_java_springboot_fundamentals.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public String addNumbers(@PathVariable int num1, @PathVariable int num2) {
        return "Sum = " + (num1 + num2);
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public String multiplyNumbers(@PathVariable int num1, @PathVariable int num2) {
        return "Product = " + (num1 * num2);
    }
}
