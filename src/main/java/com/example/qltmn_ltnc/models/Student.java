package com.example.qltmn_ltnc.models;

import java.util.Date;

public class Student {
    private int student_id;
    private String name;
    private String gender;
    private Date dob;
    private  String address;
    private String classroom;
    private String dad_name;
    private String dad_phone;
    private String dad_job;
    private String mom_name;
    private String mom_phone;
    private String mom_job;

    public Student() {
    }

    public Student(int student_id, String name, String gender, Date dob, String address, String classroom, String dad_name, String dad_phone, String dad_job, String mom_name, String mom_phone, String mom_job) {
        this.student_id = student_id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.classroom = classroom;
        this.dad_name = dad_name;
        this.dad_phone = dad_phone;
        this.dad_job = dad_job;
        this.mom_name = mom_name;
        this.mom_phone = mom_phone;
        this.mom_job = mom_job;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getDad_name() {
        return dad_name;
    }

    public void setDad_name(String dad_name) {
        this.dad_name = dad_name;
    }

    public String getDad_phone() {
        return dad_phone;
    }

    public void setDad_phone(String dad_phone) {
        this.dad_phone = dad_phone;
    }

    public String getDad_job() {
        return dad_job;
    }

    public void setDad_job(String dad_job) {
        this.dad_job = dad_job;
    }

    public String getMom_name() {
        return mom_name;
    }

    public void setMom_name(String mom_name) {
        this.mom_name = mom_name;
    }

    public String getMom_phone() {
        return mom_phone;
    }

    public void setMom_phone(String mom_phone) {
        this.mom_phone = mom_phone;
    }

    public String getMom_job() {
        return mom_job;
    }

    public void setMom_job(String mom_job) {
        this.mom_job = mom_job;
    }
}
