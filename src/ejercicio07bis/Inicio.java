/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07bis;

import ejercicio07.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juan antonio cuello
 */
public class Inicio {

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
                    System.out.print("\nIntroduce el [id] del contacto a modificar:");
                    id = Integer.parseInt(entrada.nextLine());
                    Contacto contacto=agendaJuan.obtenerContacto(id);
                    if (contacto==null){
                        System.out.println("ERROR: no existe dicho id");
                    }
                    else{
                        System.out.println("=========== MODIFICANDO EL SIGUIENTE CONTACTO =================");
                        System.out.println(contacto.aCadena());

                        //se puede preguntar por cada campo
                        System.out.print("\nIntroduce el campo a modificar(nombre/email/tlf):");
                        String campo=entrada.nextLine();

                        if (campo.equalsIgnoreCase("nombre")) {

                            System.out.print("Introduce el nuevo nombre:");
                            nombre=entrada.nextLine();
                            contacto.setNombre(nombre);

                        }else if (campo.equalsIgnoreCase("email")) {

                            System.out.print("Introduce el nuevo email:");
                            email=entrada.nextLine();
                            contacto.setEmail(email);

                        }else if (campo.equalsIgnoreCase("tlf")) {
                            System.out.print("Introduce el nuevo telefono:");
                            tlfo=entrada.nextLine();
                            contacto.setTelefono(tlfo);
                        }
                    }
                    break;

                case 4:
                    System.out.print("\nIntroduce comiendo del nombre: ");
                    String comienzo = entrada.nextLine();
                    lista=agendaJuan.buscarContacto(comienzo);
                    System.out.println("======== LISTA DE CONTACTOS POR LETRA =========");
                    System.out.println("ID       NOMBRE         EMAIL         TELEFONO");
                    for (Contacto c : lista) {
                        System.out.println(c.aCadena());
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
