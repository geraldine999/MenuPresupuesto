package com.company;

public class Servicio extends Elemento{
    private Profesional profesional;

    public Servicio( Double precio, String nombre, String descripcion, Profesional profesional) {
        super(precio, nombre, descripcion);
        this.profesional = profesional;
    }
}
