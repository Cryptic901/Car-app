package ru.anisovets.spring.Cars;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("cargoCar")
public class CargoCar implements Car {


    @Override
    public CarEnum getCarType() {
        return CarEnum.CARGO;
    }


    @Override
    public int getId() {
        return 1;
    }

    @Override
    public List<String> getName() {
        return List.of("Cargo0, Cargo1, Cargo2");
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
