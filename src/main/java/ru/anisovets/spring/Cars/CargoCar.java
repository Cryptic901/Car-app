package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class CargoCar implements Car {
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

    public void cargoInit() {
        System.out.println("CargoCar start repairing");
    }
}
