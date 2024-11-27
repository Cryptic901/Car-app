package ru.anisovets.spring.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarSalon {
    private List<Car> carList;
    @Autowired
    @Qualifier("racingCar")
    private Car car;

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String repairCar() {
        System.out.println("-----------------------------------");
        for (Car cars : carList) {
            if (cars == car) {
                System.out.println("Repairing car class: " + car.getClass().getSimpleName());
                System.out.println("With ID: " + car.getId());
                System.out.println("With name: " + car.getName());
                System.out.println("With color: " + car.getColor());
                System.out.println("With engine power: " + car.getEnginePower());
                System.out.println("-----------------------------------");
            }
        }
        return "Repairing car: " + car.getName() + " completed";
    }

    public void carInit() {
        System.out.println("Work starts");
    }

    public void carDestroy() {
        System.out.println("Work ends");
    }
}

