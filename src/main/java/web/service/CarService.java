package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    public List<Car> showCar(int num, List<Car> cars) {
        if (num > 0 && num < 5) {
            return cars.subList(0, num);
        }
        return cars;
    }

}
