package com.company;

public abstract class Elemento {

    //los elementos tienen stock infinito

    private Double precio;
    private String nombre;
    private String descripcion;


    public Elemento( Double precio, String nombre, String descripcion) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
