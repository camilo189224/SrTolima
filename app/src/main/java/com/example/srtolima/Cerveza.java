package com.example.srtolima;

public class Cerveza {

    private int foto2;
    private String nombre2;
    private String precioProducto2;

    public Cerveza(int foto2, String nombre2, String precioProducto2) {
        this.foto2 = foto2;
        this.nombre2 = nombre2;
        this.precioProducto2 = precioProducto2;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getPrecioProducto2() {
        return precioProducto2;
    }

    public void setPrecioProducto2(String precioProducto2) {
        this.precioProducto2 = precioProducto2;
    }
}
