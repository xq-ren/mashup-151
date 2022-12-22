package com.bbw.mashup.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name="flights")
public class Flights {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String airline;
    private int planeNr;
    @Temporal(TemporalType.TIME)
    @Column(name="departure_time")
    private LocalTime departureTime;

    @Temporal(TemporalType.TIME)
    @Column(name="arrival_time")
    private LocalTime arrivalTime;

    @ManyToOne
    @JoinColumn(name="weather_idfs", nullable=false)
    @JsonIgnore
    private Weather weather;

}