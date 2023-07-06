package com.example.srtolima;

public class Postobon {

    private int foto1;
    private String nombre1;
    private String precioProducto1;

    public Postobon(int foto1, String nombre1, String precioProducto1) {
        this.foto1 = foto1;
        this.nombre1 = nombre1;
        this.precioProducto1 = precioProducto1;
    }

    public int getFoto1() {
        return foto1;
    }

    public void setFoto1(int foto1) {
        this.foto1 = foto1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getPrecioProducto1() {
        return precioProducto1;
    }

    public void setPrecioProducto1(String precioProducto1) {
        this.precioProducto1 = precioProducto1;
    }
}
