package boletin20;

import com.alberto.libros.*;
import javax.swing.JOptionPane;

public class Boletin20 {

    public static void main(String[] args) {

        Metodos obx = new Metodos();
        obx.cargar();
        boolean exit = true;

        int opcion = 7;

        // Bucle para trabajar con la app
        do {
            /*
            Try para que no deje de funcionar cuando pulse cancelar en el JOptionPane y cierre la app
             */
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones:\n "
                        + "1) Engadir libros\n "
                        + "2) Consulta libro\n"
                        + "3) Amosar os libros\n"
                        + "4) Dar de baixa libros\n"
                        + "5) modificar precio libro\n"
                        + "6) escribir fichero\n"
                        + "7) Salir"));

                switch (opcion) {
                    case 1:
//                        obx.engLibro(new Libros("El retrato de Dorian Gray", "Oscar Wilde", 9.2f, 1));
                        obx.engLibro(new Libros(
                                JOptionPane.showInputDialog("Titulo"),
                                JOptionPane.showInputDialog("Autor"),
                                Float.parseFloat(JOptionPane.showInputDialog("Prezo")),
                                Integer.parseInt(JOptionPane.showInputDialog("Unidades"))));
                        break;
                    case 2:
                        //   obx.venderLibro(JOptionPane.showInputDialog("Introduzca referencia"));
                        obx.consultarLibro(JOptionPane.showInputDialog("Introduzca titulo"));
                        break;
                    case 3:
                        obx.verTodosElementos();
                        break;

                    case 4:
                        obx.borrar();
                        break;
                    case 5:
                        obx.modPrecio(JOptionPane.showInputDialog("Introduzca titulo"), Float.valueOf(JOptionPane.showInputDialog("Nuevo Precio")));
                        break;
                    case 6:
                        obx.escribir();

                        break;
                    case 7:

                        exit = false;
                        break;

                }
            } catch (NumberFormatException excepcion) {
                System.out.println("Aplicación cerrada");
                exit = false;
            }

        } while (exit == true);
    }
}
