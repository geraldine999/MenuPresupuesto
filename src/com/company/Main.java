package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Crear un sistema que tenga una interfaz que permita al usuario indicar desde un menú lo siguiente:
        //
        //1) Si quiere agregar elementos al presupuesto.
        //2) Si quiere modificar un elemento.
        //3) Si quiere eliminar un elemento.
        //
        //Los elementos/ítems pueden ser productos o servicios.
        //Cada producto tiene una cantidad, un precio unitario, un nombre y una descripción.
        //Cada servicio tiene un costo por hora y una cantidad de horas. Además del
        // nombre del servicio, el nombre de la persona que lo ejecuta y una descripción.
        //
        //Una vez que el presupuesto está listo (el usuario decide finalizar),
        // mostrar el presupuesto total y el detalle de todos los ítems agregados.

        Usuario usuario = new Usuario("Geral");
        Profesional juan = new Profesional("Juan"); //juan realiza todos los servicios


        //CATALOGO
        //1
        Producto computadora =  new Producto(3000.00, "Computadora Dell", "Modelo 2020");
        //2
        Producto computadora2 = new Producto(6000.00, "Computadora Mac", "Modelo 2018");
        //3
        Servicio arregloDeCompu = new Servicio(900.00, "Arregla la compu", "Juan arregla la compu", juan );

        int opcion = 5;

        System.out.println("Bienvenido al menu: ");

        while(opcion != 0){

            System.out.println("Oprima 1 para agregar elementos (Productos o servicios), 2 para modificar un elemento " +
                    ", 3 para eliminar un elemento y 0 para finalizar");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escriba el numero del producto o servicio que quiere agregar");
                    Scanner sc1= new Scanner(System.in);
                    int productoOServicio = sc1.nextInt();

                    System.out.println("Escriba la cantidad de items del producto o la cantidad de horas del servicio");
                    Scanner sc2 = new Scanner(System.in);
                    int cantidad = sc2.nextInt();

                    if(productoOServicio == 1) {
                        usuario.agregarElemento(computadora, cantidad);
                    }else if(productoOServicio == 2){
                        usuario.agregarElemento(computadora2, cantidad);
                    }else if(productoOServicio == 3){
                        usuario.agregarElemento(arregloDeCompu, cantidad);
                    }
                    break;

                case 2:
                    System.out.println("Escriba el numero del producto o servicio que desea modificar");
                    Scanner sc3 = new Scanner(System.in);
                    productoOServicio = sc3.nextInt();

                    System.out.println("Escriba la NUEVA cantidad de items del producto o la NUEVA cantidad de horas del " +
                            "servicio");
                    Scanner sc4 = new Scanner(System.in);
                    int nuevaCantidad = sc4.nextInt();

                    if(productoOServicio == 1) {
                        usuario.cambiarElemento(computadora, nuevaCantidad);
                    }else if(productoOServicio == 2){
                        usuario.cambiarElemento(computadora2, nuevaCantidad);
                    }else if(productoOServicio == 3){
                        usuario.cambiarElemento(arregloDeCompu, nuevaCantidad);
                    }
                    break;

                case 3:
                    System.out.println("Escriba el numero del producto o servicio que desea eliminar");
                    Scanner sc7 = new Scanner(System.in);
                    productoOServicio = sc7.nextInt();

                    if(productoOServicio == 1) {
                        usuario.eliminarElemento(computadora);
                    }else if(productoOServicio == 2){
                        usuario.eliminarElemento(computadora2);
                    }else if(productoOServicio == 3){
                        usuario.eliminarElemento(arregloDeCompu);
                    }
                    break;

                case 0:
                    opcion = 0;
                    usuario.mostrarPresupuesto();
                    break; //?



            }
        }
    }
}
