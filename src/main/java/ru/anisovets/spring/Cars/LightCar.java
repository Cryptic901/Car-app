package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("lightCar")
public class LightCar implements Car {

    @Override
    public CarEnum getCarType() {
        return CarEnum.LIGHT;
    }

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public List<String> getName() {
        return List.of("Light0, Light1, Light2");
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
