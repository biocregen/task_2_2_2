package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
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
        if (count >= 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
