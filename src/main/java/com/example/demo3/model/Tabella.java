package com.example.demo3.model;


import javax.persistence.*;

@Entity
@Table(name="tabella")
public class Tabella {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String valore;
}
