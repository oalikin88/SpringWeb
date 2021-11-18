package ru.ibs.spring.test.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ibs.spring.test.jpa.entity.Car;
import ru.ibs.spring.test.jpa.entity.Engine;
import ru.ibs.spring.test.jpa.repositories.CarRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(JpaJavaConfig.class);

        CarRepository carRepository = context.getBean(CarRepository.class);

        final Car car = new Car(null, "Ford", "focus", new Engine(null, "petrol engine"));
        carRepository.save(car);
     //   List<Car> fordList = carRepository.findCarByMnfName("Ford");

    }
}
