package com.example.lab.model;

public class Students {
    String name;
    String number;

    public Students(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Students() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
