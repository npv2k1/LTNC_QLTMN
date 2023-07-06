package com.example.qltmn_ltnc.models;

public class Classroom {
    private int class_id;
    private String class_name;
    private int studens_num;

    public Classroom() {
    }

    public Classroom(int class_id, String class_name, int studens_num) {
        this.class_id = class_id;
        this.class_name = class_name;
        this.studens_num = studens_num;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getStudens_num() {
        return studens_num;
    }

    public void setStudens_num(int studens_num) {
        this.studens_num = studens_num;
    }
}
