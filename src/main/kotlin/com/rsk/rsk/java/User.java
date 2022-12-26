package com.rsk.rsk.java;

public class  User {
    public User(String name) {
        this.name = name;
    }
    private String name;

    public void create(Created created) {
        created.onCreate(this);

    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
