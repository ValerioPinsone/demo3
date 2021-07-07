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

    public String getTitolo() {
        return titolo;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(int codLibro) {
        this.codLibro = codLibro;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    public int getCodAutoreL() {
        return codAutoreL;
    }

    public void setCodAutoreL(int codAutoreL) {
        this.codAutoreL = codAutoreL;
    }

    public int getCodCasaEdL() {
        return codCasaEdL;
    }

    public void setCodCasaEdL(int codCasaEdL) {
        this.codCasaEdL = codCasaEdL;
    }
}
