package com.example.airport.airport.repositories;

import com.example.airport.airport.models.AirPlane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirPlaneRepository extends JpaRepository<AirPlane,Long> {
}
