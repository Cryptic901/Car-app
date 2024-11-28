package ru.anisovets.spring.Cars;

import java.util.List;

public interface Car {

    CarEnum getCarType();

    int getId();

    List<String> getName();

    String getColor();

    String getEnginePower();
}
