package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;

    private String name;

    private String modelName;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Set<CarModel> carModels;

    @ManyToOne
    @JoinColumn(name = "rentalCompany_id")
    private RentalCompany rentalCompany;

    private double pricePerDay;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public RentalCompany getRentalCompany() {
        return rentalCompany;
    }

    public void setRentalCompany(RentalCompany rentalCompany) {
        this.rentalCompany = rentalCompany;
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

    public Set<CarModel> getCarModels() {
        return carModels;
    }

    public void setCarModels(Set<CarModel> carModels) {
        this.carModels = carModels;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
