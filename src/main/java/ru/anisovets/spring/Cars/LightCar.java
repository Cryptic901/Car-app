package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class LightCar implements Car {
    @Override
    public String getName() {
        return "Лимузин";
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
