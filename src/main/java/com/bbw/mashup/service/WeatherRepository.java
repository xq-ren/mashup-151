package com.bbw.mashup.service;

import com.bbw.mashup.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Flights, Long> {
}
