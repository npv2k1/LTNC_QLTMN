package com.example.qltmn_ltnc.models;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private int userId;
    private String username;
    private String password;
    private String phone;
    private String gender;
    private String address;
    private String name;
    private Date dob;

    public User() {
    }

    public User(int user_id, String username, String password, String phone, String gender, String address, String name, Date dob) {
        this.userId = user_id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.name = name;
        this.dob = dob;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
