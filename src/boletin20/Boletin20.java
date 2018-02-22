package boletin20;

import com.alberto.libros.*;
import javax.swing.JOptionPane;

public class Boletin20 {

    public static void main(String[] args) {

        Fichero.leerFichero();
        boolean exit=true;
        Metodos obx=new Metodos();
        

        int opcion=6;

        // Bucle para trabajar con la app
        do {
            /*
            Try para que no deje de funcionar cuando pulse cancelar en el JOptionPane y cierre la app
             */
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Opciones:\n "
                        +"1) Engadir libros\n "
                        +"2) Consulta libro\n"
                        +"3) Amosar os libros\n"
                        +"4) Dar de baixa un libros\n"
                        +"5) modificar precio libro"
                        +"6) Salir"));

                switch (opcion) {
                    case 1:
                     Metodos.engLibro(new Libros("El retrato de Dorian Gray", "Oscar Wilde", 9.2f, 1));
                        break;
                    case 2:
                     //   obx.venderLibro(JOptionPane.showInputDialog("Introduzca referencia"));
                        break;
                    case 3:
                        Metodos.verTodosElementos();
                        break;

                    case 4:
                   //     obx.darBaixa();
                        break;
                    case 5:
                //        System.out.println(obx.consultaLibro(JOptionPane.showInputDialog("Referencia del libro")));
                          break;
                    case 6:

                        exit=false;
                        break;

                }
            } catch (NumberFormatException excepcion) {
                System.out.println("Aplicación cerrada");
                exit=false;
            }

        } while (exit==true);
    }
    }


