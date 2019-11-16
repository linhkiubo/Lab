package com.example.lab.model;

public class Part {
    String id;
    String name;

    public Part(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Part() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
