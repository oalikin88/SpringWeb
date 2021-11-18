package ru.ibs.spring.test;

import java.time.LocalDateTime;

public class Student {
    private String name;
    private LocalDateTime creationTime;

    public Student(String name, LocalDateTime creationTime) {
        this.name = name;
        this.creationTime = creationTime;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }


}
