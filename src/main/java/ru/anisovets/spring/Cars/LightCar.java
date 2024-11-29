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
    public List<String> getName() {
        return List.of("LightCar0, LightCar1, LightCar2");
    }

    @Override
    public List<String> getColor() {
        return List.of("LightColor0, LightColor1, LightColor2");
    }

    @Override
    public List<String>  getEnginePower() {
        return List.of("LightColor0, LightColor1, LightColor2");
    }
}
