/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import Utilidades.Util;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello
 */
public class Ejercicio06 {
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        Contacto[] listaContactos = new Contacto[100];
        
        int opcion;
        boolean continuar=true;
        
        listaContactos[Contacto.getContador()]=new Contacto("Juan","juan@gmail.com","612345678");
        listaContactos[Contacto.getContador()]=new Contacto("Alicia","alicia@gmail.com","123456789");
        
        do {
            mostrarMenu();
            opcion=Integer.parseInt(entrada.nextLine());
            System.out.println("");
            
            switch(opcion){
                case 1:
                    añadirContacto(listaContactos);
                    break;
                case 2:
                    listarContactos(listaContactos);
                    break;
                case 3:
                    listarContactos(listaContactos);
                    modificarContacto(listaContactos);
                    break; 
                case 4:
                    System.out.println("Saliendo...");
                    continuar=false;
                    break;
            }
            
        } while (continuar);
    }
    
    private static void mostrarMenu(){
        System.out.println("");System.out.println("");
        System.out.println("\033[34m======================");
        System.out.printf("\033[34m%14s\n","CONTACTOS");
        System.out.println("\033[34m======================");
        System.out.println("\033[34m1.  Nuevo Contacto");
        System.out.println("\033[34m2.  Listar Contactos");
        System.out.println("\033[34m3.  Modificar Contacto");
        System.out.println("\033[34m4.  Salir\033[30m");
        System.out.print("\033[34mElige una opción:");
            
    }
    
    private static void añadirContacto(Contacto[] listaContactos){
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
                    
        listaContactos[Contacto.getContador()]= new Contacto(nombre,email,tlf);
        
    }
    
    private static void listarContactos(Contacto[] listaContactos){
        
        System.out.println("=========== LISTA DE CONTACTOS =================");
        
        System.out.println("ID       NOMBRE         EMAIL          TELEFONO");
        for (int i = 0; i < Contacto.getContador(); i++) {
            listaContactos[i].imprimirContacto();
        }
        System.out.println("================================================");
        
    }
    
    private static void modificarContacto(Contacto[] listaContactos){
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Introduce el id:");
        int id=Integer.parseInt(entrada.nextLine());
                    
        listaContactos[id-1].imprimirContacto();
        
        //se puede preguntar por cada cosa
        System.out.print("Introduce el campo a modificar(nombre/email/tlf):");
        String campo=entrada.nextLine();
                    
        if (campo.equalsIgnoreCase("nombre")) {
                        
            System.out.print("Introduce el nuevo nombre:");
            String nombre=entrada.nextLine();
            listaContactos[id-1].setNombre(nombre);
                            
        }else if (campo.equalsIgnoreCase("email")) {
                        
            System.out.print("Introduce el nuevo email:");
            String email=entrada.nextLine();
            listaContactos[id-1].setEmail(email);
                            
        }else if (campo.equalsIgnoreCase("tlf")) {
            System.out.print("Introduce el nuevo telefono:");
            String tlf=entrada.nextLine();
            listaContactos[id-1].setTelefono(tlf);
        }
        
    }
}
