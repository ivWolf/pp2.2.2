package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        carList = List.of(
                new Car("Dragon", "Vermitor", 1),
                new Car("Dragon", "Vhagar", 1),
                new Car("Dragon", "Meleys", 1),
                new Car("Dragon", "Sunfire", 1),
                new Car("Dragon", "Arrax", 1)
        );
    }

    public List<Car> getCars(int count) {
        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}