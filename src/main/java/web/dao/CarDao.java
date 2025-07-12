package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public class CarDao {
    private final List<Car> cars;

    public CarDao() {
        this.cars = List.of(
                new Car("Toyota Camry", 2020, "Black"),
                new Car("BMW X5", 2019, "White"),
                new Car("Audi A4", 2021, "Red"),
                new Car("Honda Civic", 2018, "Blue"),
                new Car("Mercedes E-class", 2022, "Silver")
        );
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}