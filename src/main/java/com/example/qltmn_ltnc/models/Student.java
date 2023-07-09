package com.example.qltmn_ltnc.models;


import java.util.Date;

public class Student extends User{
    private int student_id;

    public Student() {
    }

    public Student(int user_id, String username, String password, String phone, String gender, String address, String name, Date dob, int student_id) {
        super(user_id, username, password, phone, gender, address, name, dob);
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
