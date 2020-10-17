import java.io.*;
import java.util.Scanner;

import aeropuerto.*;

class Main {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        GestoDeAeropuestos gestor = new GestoDeAeropuestos();
        gestor.leerArchivo("./aeropuertos.txt");
        
        while (!salir) {
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("1. Dar de alta un aeropuerto");
            System.out.println("2. Dar de baja un aeropuerto");
            System.out.println("3. Consulta por un aeropuerto");
            System.out.println("4. Listar aeropuertos");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    //System.out.println("Ingrese ");
                    gestor.eliminarAeropuerto("MIA");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    gestor.imprimirAeropuestos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

}