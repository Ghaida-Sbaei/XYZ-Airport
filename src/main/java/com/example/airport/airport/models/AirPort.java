package com.example.airport.airport.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class AirPort {
    @Id
    @GeneratedValue
    private Long id;
    private String location;

    public AirPort(Long id, String location) {
        this.id = id;
        this.location = location;
    }

    public AirPort() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
