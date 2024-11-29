package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("racingCar")
public class RacingCar implements Car {

    @Override
    public CarEnum getCarType() {
        return CarEnum.RACING;
    }

    @Override
    public List<String> getName() {
        return List.of("RacingCar0", "RacingCar1", "RacingCar2");
    }


    @Override
    public List<String> getColor() {
        return List.of("RacingColor0", "RacingColor1", "RacingColor2");
    }

    @Override
    public List<String> getEnginePower() {
        return List.of("RacingPower0", "RacingPower1", "RacingPower2");
    }
}
