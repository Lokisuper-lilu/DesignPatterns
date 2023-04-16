package com.superlilu.pojo;

@SuppressWarnings("unused")
public class Book {
    public Book(String name) {
        this.name = name;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
