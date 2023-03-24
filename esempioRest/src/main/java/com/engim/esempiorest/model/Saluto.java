package com.engim.esempiorest.model;

public class Saluto {
    private int id;
    private String message;

    public Saluto() {
    }

    public Saluto(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
