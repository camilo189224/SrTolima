package com.example.srtolima;

public class Coca_cola {

    private int foto;
    private String nombre;
    private String precioProducto;

    public Coca_cola(int foto, String nombre, String precioProducto) {
        this.foto = foto;
        this.nombre = nombre;
        this.precioProducto = precioProducto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }
}
