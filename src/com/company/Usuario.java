package com.company;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private Catalogo catalogo;
    private List<Elemento> elementos = new ArrayList<>();
    private List <Integer> cantidadDeElementos = new ArrayList<>();
    private Double presupuesto = 0.00;

    public Usuario(String nombre, Catalogo catalogo) {

        this.catalogo = catalogo;
        this.nombre = nombre;
    }




    public void agregarElemento(int numeroDeProducto, int cantidad) {

        elementos.add(catalogo.getElementosEnElCatalogo().get(numeroDeProducto-1));
        cantidadDeElementos.add(cantidad);
    }



    public void cambiarElemento(int numeroDeProducto, int nuevaCantidad) {
        for (int i = 0; i< elementos.size(); i++) {
            if (elementos.get(i).equals(catalogo.getElementosEnElCatalogo().get(numeroDeProducto-1))) {
                cantidadDeElementos.set(i, nuevaCantidad);

            }
        }
    }

    public void eliminarElemento(int numeroDeProducto) {
        for (int i = 0; i< elementos.size(); i++) {
            if(elementos.get(i).equals(catalogo.getElementosEnElCatalogo().get(numeroDeProducto-1))){
                elementos.remove(i);
                cantidadDeElementos.remove(i);
            }


        }
    }

    public void mostrarPresupuesto() {
        for (int i = 0; i < elementos.size(); i++){
            System.out.println(elementos.get(i).getNombre() + ": $"+ elementos.get(i).getPrecio() + " cantidad: "+ cantidadDeElementos.get(i) );
            presupuesto += elementos.get(i).getPrecio() *  cantidadDeElementos.get(i);
        }
        System.out.println("El presupuesto total del usuario " + nombre+ " es de: $"+ presupuesto );

    }
}
