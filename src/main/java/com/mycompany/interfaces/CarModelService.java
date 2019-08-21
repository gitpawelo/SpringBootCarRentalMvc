package com.mycompany.interfaces;

import com.mycompany.model.CarModel;

import java.util.List;

public interface CarModelService {

    List<CarModel> getAllCarModels();
    CarModel addCarModel(CarModel carModel);
    CarModel updateCarModel(CarModel carModel);
    void deleteCarModel(CarModel carModel);

}
