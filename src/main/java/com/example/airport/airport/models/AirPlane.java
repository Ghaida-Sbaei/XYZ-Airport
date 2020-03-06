package com.example.airport.airport.models;

import javax.persistence.*;

@Entity
public class AirPlane {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int fuel;
    @ManyToOne
    private AirPort airPort;

    public AirPlane(Long id, String name, int fuel) {
        this.id = id;
        this.name = name;
        this.fuel = fuel;
    }
    public AirPlane(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public AirPort getAirPort() {
        return airPort;
    }

    public void setAirPort(AirPort airPort) {
        this.airPort = airPort;
    }
}
