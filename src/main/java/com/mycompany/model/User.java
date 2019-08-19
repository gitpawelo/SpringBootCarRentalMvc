package com.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;


    @NotEmpty(message = "Podaj imię")
    private String name;

    @NotEmpty(message = "Podaj nazwisko")
    private String lastname;

    @Email(message = "Podaj prawidłowy email")
    @NotNull(message = "Podaj mail")
    private String email;

    @Length(min = 3, max = 8, message = "Podaj hasło minimum 3, maksimum 8 znaków")
    @NotNull(message = "Podaj hasło")
    private String password;



}
