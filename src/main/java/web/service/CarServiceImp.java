package web.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import web.dao.*;
import web.model.*;

import java.util.*;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getLimitedCars(int count) {
        return carDao.getCars(count);
    }
}
