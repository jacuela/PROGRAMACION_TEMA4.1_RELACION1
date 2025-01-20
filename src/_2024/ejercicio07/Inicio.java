/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _2024.ejercicio07;

import Utilidades.Util;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int opcion;
        boolean continuar=true;
        
        Agenda miAgenda = new Agenda();
        
        miAgenda.addContacto("Pedro","pedro@gmail.com","600112233");
        miAgenda.addContacto("Juan","juan@gmail.com","612345678");
        miAgenda.addContacto("Alicia","alicia@gmail.com","123456789");
        
        
        
        do {
            System.out.println("");System.out.println("");
            System.out.println("\033[34m======================");
            System.out.printf("\033[34m%14s\n","CONTACTOS");
            System.out.println("\033[34m======================");
            System.out.println("\033[34m1.  Nuevo Contacto");
            System.out.println("\033[34m2.  Listar Contactos");
            System.out.println("\033[34m3.  Modificar Contacto");
            System.out.println("\033[34m4.  Salir\033[30m");
            System.out.print("\033[34mElige una opción:");
            
            opcion=Integer.parseInt(teclado.nextLine());
            System.out.println("");
            
            switch(opcion){
                case 1:
                    añadirContacto(miAgenda);
                    break;
                case 2:
                    miAgenda.listarAgenda();
                    break;
                case 3:
                    //miAgenda.listarAgenda();
                    System.out.print("ID del contacto:");
                    int id = Integer.parseInt(teclado.nextLine());
                    miAgenda.modificarContacto(id);
                    break; 
                case 4:
                    System.out.println("Saliendo...");
                    continuar=false;
                    break;
            }
            
        } while (continuar);
        
        
    }
    
    private static void añadirContacto(Agenda agenda){
        Scanner entrada=new Scanner(System.in);
        String email,nombre,tlf;
        
        System.out.print("Introduce el nombre:");
        nombre=entrada.nextLine();
                    
        do{
            System.out.print("Introduce el email:");
            email=entrada.nextLine();
            if (Util.checkEmail(email)==false){
                System.out.println("  ERROR: email incorrecto");
            }
        }while(Util.checkEmail(email)==false);  
        
        System.out.print("Introduce el numero de telefono:");
        tlf=entrada.nextLine();
                    
        agenda.addContacto(nombre, email, tlf);
    }
    
    
    
}
