package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class CargoCar implements Car {

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getName() {
        return "КАМАЗ";
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getEnginePower() {
        return "240 horsepower";
    }

}
