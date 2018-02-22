package com.alberto.libros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fichero {

    File fich;

    PrintWriter escribir;

    FileWriter fw;

    Libros lb;

    private ArrayList<Libros> lLibros = new ArrayList();

    public void leerFichero() {
        String cargaDatos;
        String[] lista;

        // A prueba de errores de carga de datos desde un Fichero ("\\s*,\\s*") para que lea espacios
        try {
            // Usar el delimitador que queramos

            // WIndows
            Scanner sc = new Scanner(new File("D:\\NeatBeansProjects\\Boletin20\\src\\fichero\\flibros.txt"));

            // Linux
            //Scanner sc=new Scanner(new File("src/fichero/flibros.txt"));
            while (sc.hasNextLine()) {
                cargaDatos = sc.nextLine();
                lista = cargaDatos.split("\\s*, \\s*");
                lb = new Libros(lista[0], lista[1], Float.valueOf(lista[2]), Integer.valueOf(lista[3]));
                lLibros.add(lb);
            }

            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro2" + ex.getMessage());
        }
        //  return lLibros;
    }

    public ArrayList<Libros> exporLibreria() {
        return this.lLibros;
    }

    public void escribirFichero(ArrayList<Libros> listaNueva) {
        try {
            //Windows
            fich = new File("D:\\NeatBeansProjects\\Boletin20\\src\\fichero\\flibros.txt");
            //Linux
//            fich = new File("src/fichero/flibros.txt");
            // escribir=new PrintWriter(fich)
            escribir = new PrintWriter(new FileWriter(fich));// Abrir Fichero y añadir sin sobreescribir
        Iterator it = listaNueva.iterator();
        while (it.hasNext()) {
            escribir.write(it.next().toString()+"\n");
        }
            escribir.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error de escritura");
        } catch (IOException ex1) {
            System.out.println("Error 4");
        }
    }

//    public static void engadirFichero(Libros lb) {
//        try {
//            fw=new FileWriter(new File("src/fichero/flibros.txt"), true);
//            fw.write(lb.toString());
//            fw.close();
//        } catch (IOException ex) {
//            System.out.println("Error 4");
//        }
//    }
}
