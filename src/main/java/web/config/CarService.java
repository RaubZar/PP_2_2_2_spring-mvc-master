package web.config;

import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Toyota Camry", 2020, "Black"));
        cars.add(new Car("BMW X5", 2019, "White"));
        cars.add(new Car("Audi A4", 2021, "Red"));
        cars.add(new Car("Honda Civic", 2018, "Blue"));
        cars.add(new Car("Mercedes E-class", 2022, "Silver"));
    }


    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCars(int count) {
        if (count >= 5) return cars;
        return cars.subList(0, Math.max(count, 0));
    }
}