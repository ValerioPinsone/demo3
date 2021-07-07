package com.example.demo3.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_libro")
public class Libro{

    @Id
    @Column(name="codlibro")
    private int codLibro;

    @Column(name="titolo")
    private String titolo;

    @Column(name="costo")
    private float costo;

    @Column(name="genere")
    private String genere;

    @Column(name="pagine")
    private int pagine;

    @Column(name="codautorel")
    private int codAutoreL;

    @Column(name="codcasaedl")
    private int codCasaEdL;
}
