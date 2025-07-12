package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    private final CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    public List<Car> getLimitedCars(int count) {
        return carDao.getCars(count);
    }
}