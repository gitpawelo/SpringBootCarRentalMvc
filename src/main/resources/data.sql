
create table car
(
    id int not null,
    name varchar(255) not null,
    modelName varchar(255) not null,
    car_models_id int not null,
    rentalCompany_id int not null,
    pricePerDay int not null
);

insert into car(id, name, modelName, car_models_id, rentalCompany_id, pricePerDay) values
(1, 'Ford', 'Mondeo', 1, 2, 100),
(2, 'BMW', 'X1', 2, 1, 120),
(3, 'Audi', 'Q7', 4, 1, 260),
(4, 'BMW', 'X5', 3, 1, 240),
(5, 'Toyota', 'Corolla', 5, 2, 80),
(6, 'Fiat', 'Tipo', 6, 1, 60),
(7, 'Toyota', 'Supra', 8, 2, 190),
(8, 'BMW', '5', 6, 1, 210),
(9, 'Ford', 'F150', 7, 2, 190);

create table carModel
(
    id int not null,
    colour varchar(255) not null,
    carType varchar(255) not null,
    engine_id int not null,
    car_id int not null
);

insert into carModel(id, colour, carType, engine_id, car_id) values
(1, 'black', 'SEDAN', 1, 1),
(2, 'red', 'SUV', 2, 2),
(3, 'white', 'SUV', 1, 3),
(4, 'pink', 'SUV', 3, 4),
(5, 'blue', 'SEDAN', 4, 1),
(6, 'green', 'SEDAN', 3, 8),
(7, 'yellow', 'PICKUP', 1, 9),
(8, 'yellow', 'COUPE', 1, 7);
