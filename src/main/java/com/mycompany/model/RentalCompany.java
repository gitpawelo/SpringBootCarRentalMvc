package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rentalCompany")
@NoArgsConstructor
@AllArgsConstructor
public class RentalCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rentalCompany_id")
    private Long id;

    @OneToMany(mappedBy = "rentalCompany", cascade = CascadeType.ALL)
    private Set<Car> car;

    @OneToMany(mappedBy = "", cascade = CascadeType.ALL)
    private Set<User> user;

    private String city;

    private int daysForRent;

    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Car> getCar() {
        return car;
    }

    public void setCar(Set<Car> car) {
        this.car = car;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDaysForRent() {
        return daysForRent;
    }

    public void setDaysForRent(int daysForRent) {
        this.daysForRent = daysForRent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
