package ru.anisovets.spring.Cars;

import java.util.List;

public interface Car {

    CarEnum getCarType();


    List<String> getName();

    List<String> getColor();

    List<String> getEnginePower();
}
