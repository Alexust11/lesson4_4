package com.example.lesson4_4.service;

import com.example.lesson4_4.model.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceProduction {
    private static String WEATHER_SERVICE_URL="https://api.openweathermap.org/data/2.5/weather?q={citi}&appid=a678924856d53964b88a3d2b1d51d67a&units=metric";
    Logger logger = LoggerFactory.getLogger(WeatherServiceProduction.class);
    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather(String city) {
        logger.debug("Запрашиваем погоду по городу:{}",city);
        Weather weather=restTemplate.exchange(
                WEATHER_SERVICE_URL,
                HttpMethod.GET,
                new HttpEntity<>(HttpHeaders.EMPTY),
                Weather.class, city).getBody();
        logger.debug("Погода в городе {} {}",city,weather);
        return  weather;
    }
}
