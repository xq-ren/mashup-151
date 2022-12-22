package com.bbw.mashup.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="flights")
public class Flights {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String text;
    private int rating;
    @Temporal(TemporalType.DATE)
    @Column(name="creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name="weather_idfs", nullable=false)
    @JsonIgnore
    private Weather weather;

}