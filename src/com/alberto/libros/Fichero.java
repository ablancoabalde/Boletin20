package com.alberto.libros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import com.alberto.libros.*;

public class Fichero {

    File fich;

    PrintWriter escribir;

    static FileWriter fw;
    static Libros lb;
    
   static  ArrayList<Libros> lLibros=new ArrayList();

    public static void leerFichero() {
        String cargaDatos;
        String[] lista;

        // A prueba de errores de carga de datos desde un Fichero ("\\s*,\\s*") para que lea espacios
        try {
            // Usar el delimitador que queramos
            Scanner sc=new Scanner(new File("src/fichero/flibros.txt"));
            while (sc.hasNextLine()) {
                cargaDatos=sc.nextLine();
                lista=cargaDatos.split("\\s*, \\s*");
                lb=new Libros(lista[0], lista[1], Float.valueOf(lista[2]), Integer.valueOf(lista[3]));
                lLibros.add(lb);
            }

            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro2"+ex.getMessage());
        }
      //  return lLibros;
    }

    public void escribirFichero() {
        try {

            fich=new File("src/fichero/flibros.txt");
            // escribir=new PrintWriter(fich)
            escribir=new PrintWriter(new FileWriter(fich, true));// Abrir Fichero y añadir sin sobreescribir
            // escribir=new PrintWriter(new File("frases.txt"));// otra opción
            escribir.println("Primeria frase");
//            escribir.println("Segunda frase");
            escribir.println("Tercera frase");
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
