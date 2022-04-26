package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    List<Car> cars;

    @GetMapping("/cars")
    public String showCat(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        cars = new ArrayList<>(Arrays.asList(
                new Car("BMW", "530d", 5),
                new Car("Mitsubishi", "Lancer Evolution", 9),
                new Car("Honda", "Civic", 6),
                new Car("Volkswagen", "Golf R", 7),
                new Car("Toyota", "Yaris GR", 4)));

        model.addAttribute("cars", carService.showCar(count, cars));
        return "cars";
    }
}
