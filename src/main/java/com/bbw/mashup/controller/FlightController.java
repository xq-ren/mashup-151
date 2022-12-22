package com.bbw.mashup.controller;


import com.bbw.mashup.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FlightController {

    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public String flightpage(Model model, HttpServletRequest request) {
        model.addAttribute("flightlist", flightService.getFlights());
        return "flights";
    }


}
