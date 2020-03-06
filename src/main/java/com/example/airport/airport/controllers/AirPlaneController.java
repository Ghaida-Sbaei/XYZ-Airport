package com.example.airport.airport.controllers;

import com.example.airport.airport.models.AirPlane;
import com.example.airport.airport.models.AirPort;
import com.example.airport.airport.repositories.AirPlaneRepository;
import com.example.airport.airport.repositories.AirPortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/airplane")
public class AirPlaneController {
    @Autowired
    private AirPlaneRepository planeRepository;
    @Autowired
    private AirPortRepository airPortRepository;

    @GetMapping
    @ResponseBody
    public List<AirPlane> getAllAirPlanes(){
        return planeRepository.findAll();
    }

    @PostMapping
    public void addAirPlane(@RequestBody AirPlane plane){
        planeRepository.save(plane);
    }

    @PostMapping("/move/{planeId}/{airportId}")
    public void moveAirPlane(@PathVariable Long planeId, @PathVariable Long airportId) throws Exception {
        AirPort airPort = airPortRepository.getOne(airportId);
        AirPlane airPlane = planeRepository.getOne(planeId);
        if(airPlane.getFuel() < 2) {
            throw new Exception();
        }
        airPlane.setFuel(airPlane.getFuel()-2);
        airPlane.setAirPort(airPort);
        airPortRepository.save(airPort);
        planeRepository.save(airPlane);
    }

    @DeleteMapping("/{id}")
    public void deleteAirPlane(@PathVariable Long id){
    planeRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateAirPlane(@PathVariable Long id,@RequestBody AirPlane plane){
        plane.setId(id);
        planeRepository.save(plane);

    }

}
