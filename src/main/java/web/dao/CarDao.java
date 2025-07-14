package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public interface CarDao {
    public List<Car> getAllCars();

    public List<Car> getCars(int count);
}