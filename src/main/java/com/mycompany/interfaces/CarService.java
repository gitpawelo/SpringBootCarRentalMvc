package com.mycompany.interfaces;

import com.mycompany.model.Car;

import java.util.List;

public interface CarService {

    List<Car>getAllCars();
    Car addCar(Car car);
    Car updateCar(Car car);
    void deleteCar(Car car);


}
