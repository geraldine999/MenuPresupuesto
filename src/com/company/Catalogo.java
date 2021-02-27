package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    List<Elemento> elementosEnElCatalogo = new ArrayList<>();

    public List<Elemento> getElementosEnElCatalogo() {
        return elementosEnElCatalogo;
    }

    public void mostrarCatalogo(){
        System.out.println("Este es el catalogo...");
        for(int i = 0; i< elementosEnElCatalogo.size(); i++){
            System.out.print(i+1 + "-");
            System.out.println(elementosEnElCatalogo.get(i).getNombre() + " $"+
                    elementosEnElCatalogo.get(i).getPrecio());

        }
    }
}
