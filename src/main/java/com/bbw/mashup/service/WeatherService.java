package com.bbw.mashup.service;

import com.bbw.mashup.model.Flights;
import com.bbw.mashup.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    private WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public List<Weather> getWeather() {
        return (ArrayList) weatherRepository.findAll();
    }
}
