package com.company;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<Elemento> elementos = new ArrayList<>();
    private List <Integer> cantidadDeElementos = new ArrayList<>();

    public Usuario(String nombre) {
        super(nombre);
    }


    public void agregarElemento(Elemento productoOServicio, int cantidad) {
        elementos.add(productoOServicio);
        cantidadDeElementos.add(cantidad);
    }



    public void cambiarElemento(Elemento elemento, int nuevaCantidad) {
        for (int i = 0; i< elementos.size(); i++) {
            if (elementos.get(i).equals(elemento)) {
                cantidadDeElementos.set(i, nuevaCantidad);

            }
        }
    }

    public void eliminarElemento(Elemento elemento) {
        for (int i = 0; i< elementos.size(); i++) {
            if(elementos.get(i).equals(elemento)){
                elementos.remove(i);
                cantidadDeElementos.remove(i);
            }


        }
    }

    public void mostrarPresupuesto() {
        Double presupuesto = 0.00;
        for (int i = 0; i < elementos.size(); i++){
            System.out.println(elementos.get(i).getNombre() + ": $"+ elementos.get(i).getPrecio() + " cantidad: "+ cantidadDeElementos.get(i) );
            presupuesto += elementos.get(i).getPrecio() *  cantidadDeElementos.get(i);
        }
        System.out.println("El presupuesto total es de: $"+ presupuesto );

    }
}
