package com.lwl.rabbitmaq.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book() {
    }
}
