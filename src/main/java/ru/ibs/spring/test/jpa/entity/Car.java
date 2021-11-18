package ru.ibs.spring.test.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "AUTOS")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue //автоматически генерирует id
    @Column(name = "ID")
    private Long id;
    @Column(name = "MANUFACTURER")
    private String mnfName;
    @Column(name = "MODEL")
    private String modelName;

    @OneToOne(cascade = CascadeType.ALL)
    Engine engine;

}
