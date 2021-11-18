package ru.ibs.spring.test.jpa.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.ibs.spring.test.jpa.entity.Car;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findCarByMnfName(String mnfName); // - в этом случае спринг сгенерирует класс Car таким образом
                                            // что в нём будет метод, который будет искать в таблице записи
                                          // по полю mnfName
}
