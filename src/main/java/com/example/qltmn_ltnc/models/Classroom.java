package com.example.qltmn_ltnc.models;

import java.time.LocalDate;

public class Classroom {
    private int classroom_id;
    private String name;
    private int numberOfStudent;
    private LocalDate year;

    public Classroom() {
    }

    public Classroom(int classroom_id, String name, int numberOfStudent, LocalDate year) {
        this.classroom_id = classroom_id;
        this.name = name;
        this.numberOfStudent = numberOfStudent;
        this.year = year;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }
}
