package com.example.qltmn_ltnc.models;

import java.time.LocalDate;

public class Parent extends User{
    private int parent_id;

    public Parent() {
    }

    public Parent(int user_id, String username, String password, String phone, String gender, String address, String name, LocalDate dob, int parent_id) {
        super(user_id, username, password, phone, gender, address, name, dob);
        this.parent_id = parent_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }
}
