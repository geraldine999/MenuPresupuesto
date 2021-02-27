package com.company;

import java.util.*;

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

        //Los usuarios hacen fila para pedir presupuestos y esos presupuestos al final del día se muestran en el orden de llegada.

        Profesional juan = new Profesional("Juan"); //juan realiza todos los servicios

        Catalogo catalogo = new Catalogo();
        //CATALOGO
        //1
        Producto computadora =  new Producto(3000.00, "Computadora Dell", "Modelo 2020");
        //2
        Producto computadora2 = new Producto(6000.00, "Computadora Mac", "Modelo 2018");
        //3
        Servicio arregloDeCompu = new Servicio(900.00, "Arregla la compu", "Juan arregla la compu", juan );
        catalogo.getElementosEnElCatalogo().add(computadora);
        catalogo.getElementosEnElCatalogo().add(computadora2);
        catalogo.getElementosEnElCatalogo().add(arregloDeCompu);


        //cola de usuarios
        List <Usuario> usuarios = new ArrayList<>();


        int opcion = 5;
        int opcion2 = 5;

        System.out.println("Bienvenido al menu: ");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        catalogo.mostrarCatalogo();
        String nombreDelNuevoUsuario = " ";

        while(opcion != 0){

            System.out.print("Escriba el nombre del nuevo usuario:");
            nombreDelNuevoUsuario = sc2.nextLine();
            Usuario usuario = new Usuario(nombreDelNuevoUsuario, catalogo);
            usuarios.add(usuario);

            opcion2 = 5;

            while(opcion2!= 0){
            System.out.println("Oprima 1 para agregar elementos (Productos o servicios), 2 para modificar un elemento " +
                    ", 3 para eliminar un elemento, 4 para mostrar el presupuesto del usuario actual y pasar a otro usuario" +
                    " o cualquier otro numero para finalizar y mostrar todos los usuarios del dia con su" +
                    "presupuesto");

            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Escriba el numero del producto o servicio que quiere agregar");
                    int productoOServicio = sc.nextInt();

                    System.out.println("Escriba la cantidad de items del producto o la cantidad de horas del servicio");
                    int cantidad = sc.nextInt();

                    usuario.agregarElemento(productoOServicio, cantidad);
                    break;

                case 2:
                    System.out.println("Escriba el numero del producto o servicio que desea modificar");
                    productoOServicio = sc.nextInt();

                    System.out.println("Escriba la NUEVA cantidad de items del producto o la NUEVA cantidad de horas del " +
                            "servicio");
                    int nuevaCantidad = sc.nextInt();

                    usuario.cambiarElemento(productoOServicio, nuevaCantidad);
                    break;

                case 3:
                    System.out.println("Escriba el numero del producto o servicio que desea eliminar");
                    productoOServicio = sc.nextInt();
                    usuario.eliminarElemento(productoOServicio);
                    break;

                case 4:
                    opcion2 = 0;
                    usuario.mostrarPresupuesto();
                    break;

                default:
                    opcion = 0;
                    opcion2 = 0;
                    for (Usuario u : usuarios) {
                        u.mostrarPresupuesto();

                    }

            }



            }
        }
    }
}
