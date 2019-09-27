package com.mycompany.service;

import com.mycompany.interfaces.CarService;
import com.mycompany.model.Car;
import com.mycompany.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {return carRepository.getOne(id);}

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(Car car) {
        carRepository.delete(car);
    }
}
