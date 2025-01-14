/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

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
        Scanner teclado = new Scanner(System.in);
        String nombre,email;
        
        Persona[] listaPersonas = new Persona[10];
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("Dime el nombre:");
            nombre = teclado.nextLine();
            
            do{
                System.out.print("Dime el email:");
                email = teclado.nextLine();
                if (Util.checkEmail(email)==false){
                    System.out.println("     ERROR: email incorrecto");
                }
            }while (Util.checkEmail(email)==false);
            
            listaPersonas[i]=new Persona(nombre,email);
            System.out.println("-------- añadida. "+
                    Persona.getContadorPersonas()+" en la lista");
        }
        
        System.out.println("=======================================");
        for (int i = 0; i < Persona.getContadorPersonas(); i++) {
            System.out.println(listaPersonas[i].getDatos());
        }
        System.out.println("=======================================");
        
        
        
        
        
    }
    
}
