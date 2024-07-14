package web.controller;

import Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarService();
    @GetMapping("/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";

    }
}