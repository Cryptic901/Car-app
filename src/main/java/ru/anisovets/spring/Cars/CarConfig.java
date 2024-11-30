package ru.anisovets.spring.Cars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:CarSalon.properties")
public class CarConfig {

    @Bean
public RacingCar racingCar() {
        return new RacingCar();
    }

    @Bean
    public CargoCar cargoCar() {
        return new CargoCar();
    }

    @Bean
    public LightCar lightCar() {
        return new LightCar();
    }

    @Bean
    public CarSalon carSalon() {
        return new CarSalon(carList());
    }

    @Bean
    public List<Car> carList() {
        List<Car> cars = new ArrayList<>();
        cars.add(racingCar());
        cars.add(cargoCar());
        cars.add(lightCar());
        return cars;
    }

    @Bean
    public Street street() {
        return new Street(carSalon());
    }
}
