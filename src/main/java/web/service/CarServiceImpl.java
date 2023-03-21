package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(1, 2000, "Mercedes"));
        cars.add(new Car(2, 2015, "Lada"));
        cars.add(new Car(3, 1980, "BMW"));
        cars.add(new Car(4, 2013, "Chevrolet"));
        cars.add(new Car(5, 1997, "Honda"));
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> result = new ArrayList<>();
        int i = 0;
        for (Car car : cars) {
            if (i >= count) {
                break;
            }
            result.add(car);
            i++;
        }
        return result;
    }
}
