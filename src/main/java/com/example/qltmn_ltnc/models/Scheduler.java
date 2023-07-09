package com.example.qltmn_ltnc.models;

import java.time.LocalDate;

public class Scheduler { //Kế thừa Teacher, Subject, Classroom
    private int schedule_id;
    private LocalDate time;
    public Scheduler() {
    }

    public Scheduler(int schedule_id, LocalDate time) {
        this.schedule_id = schedule_id;
        this.time = time;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
}
