package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("racingCar")
public class RacingCar implements Car {

    @Override
    public CarEnum getCarType() {
        return CarEnum.RACING;
    }

    @Override
    public int getId() {
        return 3;
    }

    @Override
    public List<String> getName() {
        List<String> racingCars = new ArrayList<>();
        racingCars.add("Racing0");
        racingCars.add("Racing1");
        racingCars.add("Racing2");
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
