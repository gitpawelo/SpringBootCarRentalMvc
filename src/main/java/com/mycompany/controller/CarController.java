package com.mycompany.controller;


import com.mycompany.model.Car;
import com.mycompany.service.CarServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class CarController {

    private CarServiceImpl carService;

    @GetMapping("/car")
    private List<Car> getAllCars (){ return carService.getAllCars();}

    @GetMapping("/car/{id}")
    public ResponseEntity<Car>findCarById(@PathVariable(value = "id") Long id){
        Car car =carService.getCarById(id);
        if (car == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(car);
    }



}
