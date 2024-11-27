package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class RacingCar implements Car{
    @Override
    public int getId() {
        return 3;
    }

    @Override
    public String getName() {
        return "Porsche 911 Hybrid";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getEnginePower() {
        return "900 horsepower";
    }

}
