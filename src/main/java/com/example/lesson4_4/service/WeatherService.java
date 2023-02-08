package com.example.lesson4_4.service;

import com.example.lesson4_4.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static String WEATHER_SERVICE_URL="api.openweathermap.org/data/2.5/weather?q=abakan&appid=a678924856d53964b88a3d2b1d51d67a&units=metric";
    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather(String city) {
        return
    }
}
