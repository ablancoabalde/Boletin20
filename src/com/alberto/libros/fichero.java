package com.alberto.libros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class fichero {

    File fich;

    PrintWriter escribir;

    FileWriter fw;
    Libros lb;
    ArrayList<Libros> lLibros = new ArrayList();

    public ArrayList<Libros> leerObjeto() {
        String cargaDatos;
        String[] lista;
        
        // A prueba de errores de carga de datos desde un fichero ("\\s*,\\s*") para que lea espacios
        try {
            // Usar el delimitador que queramos
            Scanner sc=new Scanner(new File("src/fichero/flibros.txt"));
            while (sc.hasNextLine()) {
                cargaDatos=sc.nextLine();
                lista=cargaDatos.split(",");
//                System.out.println(lista[0] +" "+ lista[1]);
//                lLibros=new lb(lista[0],lista[1],Float.valueOf(lista[2]), Integer.valueOf(lista[3]));
//
//                if (Integer.valueOf(lista[1])<5) {
//                    lSusp.add(lA);
//                }

//                System.out.println(lA);
            }

            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro2"+ex.getMessage());
        }
       return null;
    }

    public void escribirFichero() {
        try {

            fich=new File("src/fichero/flibros.txt");
            // escribir=new PrintWriter(fich)
            escribir=new PrintWriter(new FileWriter(fich, true));// Abrir fichero y añadir sin sobreescribir
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

//    public void engadirFichero() {
//        try {
//            fw=new FileWriter(new File("src/fichero/flibros.txt"), true);
//            fw.write("Añado linea\n");
//            fw.close();
//        } catch (IOException ex) {
//            System.out.println("Error 4");
//        }
//    }
}
