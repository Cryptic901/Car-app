package ru.anisovets.spring.Cars;

import java.util.Random;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


import java.util.List;

public class CarSalon {
    @Value("${carSalon.name}")
    private String name;
    @Value("${carSalon.color}")
    private String color;

    private List<Car> carList;

    private Car car;
    private Car cargoCar;
    private Car lightCar;
    private Car racingCar;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public CarSalon(@Qualifier("carList") List<Car> carList) {
        this.carList = carList;
    }

    public String repairCar() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(carList.size());
        StringBuilder ret = new StringBuilder();
        for (Car cars : carList) {
            System.out.println("Repairing car class: " + cars.getClass().getSimpleName());
            System.out.println("With name: " + cars.getName());
            System.out.println("With color: " + cars.getColor());
            System.out.println("With engine power: " + cars.getEnginePower());
            System.out.println("-----------------------------------");
            ret.append("\nRepairing: ").append(cars.getName()).append(" completed");
        }
        System.out.println("Random car: " + carList.get(randomIndex).getName());
        return ret.toString();
    }

    @PostConstruct
    public void carInit() {
        System.out.println("Work starts");
        System.out.println("-----------------------------------");
    }

    @PreDestroy
    public void carDestroy() {
        System.out.println("-----------------------------------");
        System.out.println("Work ends");
    }
}

