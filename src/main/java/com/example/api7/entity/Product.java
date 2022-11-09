package com.example.api7.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@RequiredArgsConstructor
@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String text;

    private int quantity;

    private boolean completed;

    private String producer;

    public Product(String text, int quantity, boolean completed, String producer) {
        this.text = text;
        this.quantity = quantity;
        this.completed = completed;
        this.producer = producer;
    }
}
