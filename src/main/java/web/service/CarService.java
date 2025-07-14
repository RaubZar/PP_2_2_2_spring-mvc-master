package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public interface CarService {
    public List<Car> getAllCars();

    public List<Car> getLimitedCars(int count);
}