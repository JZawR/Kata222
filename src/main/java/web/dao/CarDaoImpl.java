package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    private static int CARS_COUNT = 0;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(++CARS_COUNT, "Lada", "Grey"));
        carsList.add(new Car(++CARS_COUNT, "Nissan", "Black"));
        carsList.add(new Car(++CARS_COUNT, "Lada", "Silver"));
        carsList.add(new Car(++CARS_COUNT, "Volkswagen", "Brown"));
        carsList.add(new Car(++CARS_COUNT, "Honda", "Chrome"));
    }

    public List<Car> getCarList() {
        return carsList;
    }
}
