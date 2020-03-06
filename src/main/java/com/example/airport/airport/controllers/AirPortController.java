package com.example.airport.airport.controllers;

import com.example.airport.airport.models.AirPort;
import com.example.airport.airport.repositories.AirPortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/airport")
public class AirPortController {

    @Autowired
    private AirPortRepository airPortRepository;

    @GetMapping
    @ResponseBody
    public List<AirPort> getAllAirPorts(){
        return airPortRepository.findAll();
    }

    @PostMapping
    public void addAorPort(@RequestBody AirPort airPort){
    airPortRepository.save(airPort);
    }

    @DeleteMapping("/{id}")
    public void deleteAirPort(@PathVariable Long id){
        airPortRepository.deleteById(id);
    }
    @PutMapping("/{id}")
    public void updateAirPort(@PathVariable Long id,@RequestBody AirPort airPort){
    airPort.setId(id);
    airPortRepository.save(airPort);

    }

}
