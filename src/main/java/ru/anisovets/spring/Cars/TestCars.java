package ru.anisovets.spring.Cars;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestCars {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        context.start();

        Street street = context.getBean("street", Street.class);
        System.out.println(street);

        CarSalon carSalon = context.getBean("carSalon", CarSalon.class);
        System.out.println(carSalon.getName());
        System.out.println(carSalon.getColor());

        context.close();

    }
}
