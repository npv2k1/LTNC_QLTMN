package com.example.qltmn_ltnc.models;

import java.time.LocalDate;

public class User {
    private int user_id;
    private String username;
    private String password;
    private String phone;
    private String gender;
    private String address;
    private String name;
    private LocalDate dob;

    public User() {
    }

    public User(int user_id, String username, String password, String phone, String gender, String address, String name, LocalDate dob) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.name = name;
        this.dob = dob;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
