package com.example.lesson4_4.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/weather/{citi}")
    public ResponseEntity<Viod> getWeather(@PathVariable("citi") String city) {

    }
}
