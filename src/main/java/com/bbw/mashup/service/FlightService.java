package com.bbw.mashup.service;

import com.bbw.mashup.model.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    private FlightRepository mashupRepository;

    @Autowired
    public FlightService(FlightRepository mashupRepository) {
        this.mashupRepository = mashupRepository;
    }

    public List<Flights> getFlights() {
        return (ArrayList) mashupRepository.findAll();
    }
}
