package com.example.qltmn_ltnc.models;


import java.util.Date;

public class Teacher extends User{
    private int teacher_id;
    private String degree;

    public Teacher() {
    }

    public Teacher(int user_id, String username, String password, String phone, String gender, String address, String name, Date dob, int teacher_id, String degree) {
        super(user_id, username, password, phone, gender, address, name, dob);
        this.teacher_id = teacher_id;
        this.degree = degree;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
