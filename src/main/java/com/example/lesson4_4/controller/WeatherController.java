package com.example.lesson4_4.controller;

import com.example.lesson4_4.model.Weather;
import com.example.lesson4_4.service.WeatherServiceProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherServiceProduction weatherServiceProduction;
    @GetMapping("/weather/{citi}")
    public ResponseEntity<Weather> getWeather(@PathVariable("citi") String city) {
        return ResponseEntity.ok(weatherServiceProduction.getWeather(city));
    }
}
