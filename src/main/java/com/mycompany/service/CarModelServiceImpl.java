package com.mycompany.service;

import com.mycompany.interfaces.CarModelService;
import com.mycompany.model.CarModel;
import com.mycompany.repository.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarModelServiceImpl implements CarModelService {

    @Autowired
    private CarModelRepository carModelRepository;

    @Override
    public List<CarModel> getAllCarModels() {
        return carModelRepository.findAll();
    }

    @Override
    public CarModel addCarModel(CarModel carModel) {
        return carModelRepository.save(carModel);
    }

    @Override
    public CarModel updateCarModel(CarModel carModel) {
        return carModelRepository.save(carModel);
    }

    @Override
    public void deleteCarModel(CarModel carModel) {
        carModelRepository.delete(carModel);
    }
}
