package com.example.demo.model;

public class Student {
    private int id;
    private  String name;
    private  String Cousrse;

    public Student(int id, String name, String cousrse) {
        this.id = id;
        this.name = name;
        Cousrse = cousrse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCousrse() {
        return Cousrse;
    }

    public void setCousrse(String cousrse) {
        Cousrse = cousrse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
