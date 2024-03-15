package com.example.miscosuiproject.DataClass;


public class User {
    private String name;
    private String role;
    private int imageResourceId; // Add this field

    public User(String name, String role, int imageResourceId) {
        this.name = name;
        this.role = role;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}


