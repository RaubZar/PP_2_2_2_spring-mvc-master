package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String showAllCars(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count,
                           Model model) {
        List<Car> cars = (count == null)
                ? carService.getAllCars()
                : carService.getLimitedCars(count);

        model.addAttribute("cars", cars);
        return "cars";
    }
}