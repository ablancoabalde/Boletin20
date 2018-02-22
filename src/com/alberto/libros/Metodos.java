package com.alberto.libros;

import java.util.Iterator;

public class Metodos {
    
    public static void verTodosElementos() {
        Iterator it=Fichero.lLibros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void engLibro(Libros lb) {
        Fichero.lLibros.add(lb);

    }

}
