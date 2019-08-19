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

}
