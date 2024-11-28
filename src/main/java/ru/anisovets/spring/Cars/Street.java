package ru.anisovets.spring.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Street {
    private String name;
    private CarSalon carSalon;

    @Autowired
    public Street(CarSalon carSalon) {
        this.name = "Goida Street";
        this.carSalon = carSalon;
    }

    @Override
    public String toString() {
        return "Street: " + name + ", " + carSalon.repairCar();
    }
}
