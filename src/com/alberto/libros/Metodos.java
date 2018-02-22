package com.alberto.libros;

import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {

    Fichero f = new Fichero();

    ArrayList<Libros> lLibros = new ArrayList();

    // MEtodo que hace la llamada a leerfichero y exporta el arraylist de Fichero
    public void cargar() {
        f.leerFichero();
        lLibros = f.exporLibreria();
    }

    // Metodo 3
    public void verTodosElementos() {
        Iterator it = lLibros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Añado libro al ArrayList METODO 1
    public void engLibro(Libros lb) {
        lLibros.add(lb);
    }

    public void consultarLibro(String titulo) {
        Boolean encontrado = false;
        for (Libros aux : lLibros) {
            if (aux.getNomLibro().equalsIgnoreCase(titulo)) {
                System.out.println("Precio " + aux.getPrecio());
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Libro no encontrado");
        }
    }

    public void borrar() {
        Iterator<Libros> it = lLibros.iterator();
        while (it.hasNext()) {
            if (it.next().getUnidades() == 0) {
                it.remove();
            }
        }
    }
    
    
    public void modPrecio(String titulo, Float nuevoPrecio) {
        Boolean encontrado = false;
        for (Libros aux : lLibros) {
            if (aux.getNomLibro().equalsIgnoreCase(titulo)) {
                aux.setPrecio(nuevoPrecio);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Libro no encontrado");
        }
    }
    
    public void  escribir(){
        
        f.escribirFichero(lLibros);
    }
}
