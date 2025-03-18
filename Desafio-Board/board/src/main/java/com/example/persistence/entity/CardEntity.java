package com.example.persistence.entity;

public class CardEntity {

    private Long Id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();
}
