package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("lightCar")
public class LightCar implements Car {

    @Override
    public String getName() {
        return "Honda gomo";
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
