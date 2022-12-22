package com.bbw.mashup.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="weather")
public class Weather {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int temp;

    @OneToMany(mappedBy="weather")
    private List<Flights> flights;

}
