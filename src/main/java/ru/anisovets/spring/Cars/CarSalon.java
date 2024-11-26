package ru.anisovets.spring.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarSalon {
    private List<Car> carList = new ArrayList<>();
    private String carType;
    private String street;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public CarSalon() {
    }

    public void repairCar() {
        System.out.println("-----------------------------------");
        for (Car car : carList) {
            System.out.println("Repairing car class: " + car.getClass().getSimpleName());
            System.out.println("With name: " + car.getName());
            System.out.println("With color: " + car.getColor());
            System.out.println("With engine power: " + car.getEnginePower());
            System.out.println("-----------------------------------");
        }
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}

