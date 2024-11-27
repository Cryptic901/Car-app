package ru.anisovets.spring.Cars;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarSalon {
    private List<Car> carList;
    private Car car;
    private Car cargoCar;
    private Car lightCar;
    private Car racingCar;

    @Autowired
    public CarSalon(@Qualifier("cargoCar") Car cargoCar,
                    @Qualifier("lightCar") Car lightCar,
                    @Qualifier("racingCar") Car racingCar) {
        this.cargoCar = cargoCar;
        this.lightCar = lightCar;
        this.racingCar = racingCar;
    }

    @Autowired
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String repairCar() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(carList.size());
        StringBuilder ret = new StringBuilder();
        System.out.println("-----------------------------------");
        for (Car cars : carList) {
            System.out.println("Repairing car class: " + cars.getClass().getSimpleName());
            System.out.println("With name: " + cars.getName());
            System.out.println("With color: " + cars.getColor());
            System.out.println("With engine power: " + cars.getEnginePower());
            System.out.println("-----------------------------------");
            ret.append("\nRepairing: ").append(cars.getName()).append(" completed, ");
        }
        System.out.println("Random car: " + carList.get(randomIndex).getName());
        return ret.toString();
    }

    public void carInit() {
        System.out.println("Work starts");
    }

    public void carDestroy() {
        System.out.println("Work ends");
    }
}

