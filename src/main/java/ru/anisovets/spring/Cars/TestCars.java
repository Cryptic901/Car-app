package ru.anisovets.spring.Cars;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestCars {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        context.start();

        CarSalon carSalon = context.getBean("carSalon", CarSalon.class);
        carSalon.repairCar();

        context.close();

    }
}
