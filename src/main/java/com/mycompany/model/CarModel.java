package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "carModel")
@NoArgsConstructor
@AllArgsConstructor
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carModel_id")
    private Long id;

    private String modelName;

    private String colour;

    private CarType carType;

    @OneToMany(mappedBy = "carModel", cascade = CascadeType.ALL)
    private Set<Engine> engine;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Set<Engine> getEngine() {
        return engine;
    }

    public void setEngine(Set<Engine> engine) {
        this.engine = engine;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
