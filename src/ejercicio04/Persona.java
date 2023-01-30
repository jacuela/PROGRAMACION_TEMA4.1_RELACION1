/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author juan.antonio
 */
public class Persona {
    private String nombre;
    private String email;
    public static int contadorPersonas=0;
    
    
    public Persona(String n,String e){
        this.nombre=n;
        this.email=e;
        Persona.contadorPersonas++;
        
    }
    
    public void imprimirDatos(){
        System.out.println(this.nombre+" - "+this.email);
        
    }
    
    
    
    
    
    
}
