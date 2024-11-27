package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class LightCar implements Car {
    @Override
    public int getId() {
        return 2;
    }

    @Override
    public String[] getName() {
        String[] lightCars = new String[3];
        lightCars[0] = "Light0";
        lightCars[1] = "Light1";
        lightCars[2] = "Light2";
        return lightCars;
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getEnginePower() {
        return "200 horsepower";
    }
}
