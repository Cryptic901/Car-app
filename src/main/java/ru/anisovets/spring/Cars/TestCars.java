package ru.anisovets.spring.Cars;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestCars {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        context.start();

//        CarSalon carSalon = context.getBean("carSalon", CarSalon.class);
//        carSalon.repairCar();

        Street street = context.getBean("street", Street.class);
        System.out.println(street);
        context.close();

    }
}
