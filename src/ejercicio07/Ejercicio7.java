/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juan antonio cuello
 */
public class Ejercicio7 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Agenda agendaJuan = new Agenda();

        String nombre, email, tlfo;
        int id;
        ArrayList<Contacto> lista;

        agendaJuan.addContacto("Juan", "juan@gmail.com", "612345678");
        agendaJuan.addContacto("Alicia", "alicia@gmail.com", "123456789");
        agendaJuan.addContacto("Junajo", "juanjo@gmail.com", "123456789");
        agendaJuan.addContacto("Jaime", "jaime@gmail.com", "123456789");
        

        int opcion;

        do {
            System.out.println("");System.out.println("");    
            System.out.printf("\033[34m%14s\n", "AGENDA DE CONTACTOS");
            System.out.println("\033[34m¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("\033[34m1.  Añadir");
            System.out.println("\033[34m2.  Lista completa");
            System.out.println("\033[34m3.  Modificar");
            System.out.println("\033[34m4.  Buscar");
            System.out.println("\033[34m5.  Salir\033[30m");

            System.out.print("Elige una opción:");
            opcion = Integer.parseInt(entrada.nextLine());
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("\nAñadiendo un contacto...");

                    //Pido los datos del contacto
                    System.out.print("Nombre:");
                    nombre = entrada.nextLine();
                    System.out.print("email:");
                    email = entrada.nextLine();
                    System.out.print("telefono:");
                    tlfo = entrada.nextLine();
                    //Los añado usando el método de la agenda
                    agendaJuan.addContacto(nombre, email, tlfo);
                    break;

                case 2:
                    agendaJuan.listarAgenda();
                    break;

                case 3:
                    System.out.println("1. Modificar por ID");
                    System.out.println("2. Modificar por NOMBRE");
                    System.out.print("Elige una opción:");
                    do {
                        opcion = Integer.parseInt(entrada.nextLine());
                    } while (opcion != 1 && opcion != 2);

                    if (opcion == 1) {
                        System.out.print("\nIntroduce el [id] del contacto a modificar:");
                        id = Integer.parseInt(entrada.nextLine());
                        agendaJuan.modificarContacto(id);

                    }else{
                        System.out.print("\nIntroduce el [nombre] del contacto a modificar:");
                        nombre = entrada.nextLine();
                        agendaJuan.modificarContacto(nombre);
                        
                    }
                    break;

                case 4:
                    System.out.print("\nIntroduce comiendo del nombre: ");
                    String comienzo = entrada.nextLine();
                    lista=agendaJuan.buscarContacto(comienzo);
                    System.out.println("======== LISTA DE CONTACTOS POR LETRA =========");
                    System.out.println("ID       NOMBRE         EMAIL         TELEFONO");
                    for (Contacto contacto : lista) {
                        System.out.println(contacto.aCadena());
                    }
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        } while (opcion != 5);
    }

}
