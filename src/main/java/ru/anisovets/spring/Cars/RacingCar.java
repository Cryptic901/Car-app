package ru.anisovets.spring.Cars;

public class RacingCar implements Car{
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
