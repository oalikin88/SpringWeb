package ru.ibs.spring.test;

import java.util.LinkedList;
import java.util.List;

public class StudentStorage {
    private static List<Student> studentList = new LinkedList<>();

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        StudentStorage.studentList = studentList;
    }

    public StudentStorage() {
    }
}
