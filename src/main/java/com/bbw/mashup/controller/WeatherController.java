package com.bbw.mashup.controller;

import com.bbw.mashup.service.FlightService;
import com.bbw.mashup.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

public class WeatherController {
    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String flightpage(Model model, HttpServletRequest request) {
        model.addAttribute("weatherlist", weatherService.getWeather());
        return "weather";
    }
}
