package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

@Component
public class CargoCar implements Car {

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String[] getName() {
        String[] cargoCars = new String[3];
        cargoCars[0] = "Cargo0";
        cargoCars[1] = "Cargo1";
        cargoCars[2] = "Cargo2";
        return cargoCars;
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
