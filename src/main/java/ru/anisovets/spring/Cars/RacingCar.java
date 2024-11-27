package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class RacingCar implements Car{
    @Override
    public int getId() {
        return 3;
    }

    @Override
    public String[] getName() {
        String[] racingCars = new String[3];
        racingCars[0] = "Racing0";
        racingCars[1] = "Racing1";
        racingCars[2] = "Racing2";
        return racingCars;
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
