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

        Street street = context.getBean("street", Street.class);
        System.out.println(street);
        context.close();

    }
}
