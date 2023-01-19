/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import Utilidades.*;
import java.util.Scanner;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String nombre,email;
        
        int contadorPersonas=0;
        Persona[] lista=new Persona[10];
        
        for (int i = 0; i < 2; i++) {
            //Primero: leer datos
            System.out.println("");
            System.out.print("Dime tu nombre: ");
            nombre=teclado.nextLine();
            
            do{
                    System.out.print("Dime tu email: ");
                    email=teclado.nextLine();
                    
                    if(!Utilidades.checkEmail(email)){  //idem a Utilidades.checkEmail(email)==false
                        System.out.println("  ERROR: el formato es incorrecto");
                    }
                    
            }while(!Utilidades.checkEmail(email));
                    
                    
            //Meto persona en el array
            Persona p=new Persona(nombre,email);
            lista[i]=p;
            contadorPersonas++;
            System.out.println("#persona introducida correctamente");
            
            
        }
        
        System.out.println("====================================");
        for (int i = 0; i < contadorPersonas; i++) {
            lista[i].imprimirDatos();
        }
        System.out.println("====================================");
        
        
        
        
        
    }
    
}
