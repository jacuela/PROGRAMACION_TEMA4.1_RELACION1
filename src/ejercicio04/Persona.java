/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Persona {
    private String nombre;
    private String email;
    private static int contadorPersonas=0;
    
    
    public Persona(String n, String e){
        this.nombre = n;
        this.email = e;
       
        Persona.contadorPersonas++;
        //contasdorPersonas++;  //tambien vale así
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    
    
    
    
    public String getDatos(){
        return String.format ("%15s - %s",this.nombre,this.email);
    }
 
    
    
    
}
