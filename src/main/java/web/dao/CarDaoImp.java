package web.dao;

import org.springframework.stereotype.*;
import web.model.*;

import java.util.*;

@Repository
public class CarDaoImp implements CarDao{
    private final List<Car> cars;

    public CarDaoImp() {
        this.cars = List.of(
                new Car("Toyota Camry", 2020, "Black"),
                new Car("BMW X5", 2019, "White"),
                new Car("Audi A4", 2021, "Red"),
                new Car("Honda Civic", 2018, "Blue"),
                new Car("Mercedes E-class", 2022, "Silver")
        );
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
