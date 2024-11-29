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
    public List<String> getName() {
        return List.of("Cargo0, Cargo1, Cargo2");
    }

    @Override
    public List<String> getColor() {
        return List.of("CargoColor0, CargoColor1, CargoColor2");
    }

    @Override
    public List<String> getEnginePower() {
        return List.of("CargoPower0, CargoPower1, CargoPower2");
    }


}
