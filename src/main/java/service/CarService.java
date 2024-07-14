package service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

    public class CarService {
        private static List<Car> cars = List.of(
                new Car("Audi", "White", 111),
                new Car("Mercedes", "Black", 222),
                new Car("BMW", "White", 333),
                new Car("RangeRover", "Black", 444),
                new Car("Porsche", "White", 555)
        );

        public List<Car> getCars(int numberOfCars) {
            List<Car> result = new ArrayList<>();
            for (int i = 0; i < numberOfCars && i < cars.size(); i++) {
                result.add(cars.get(i));
            }
            return result;
        }
    }
