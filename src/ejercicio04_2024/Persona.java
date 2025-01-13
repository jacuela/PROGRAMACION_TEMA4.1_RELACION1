/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04_2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Persona {
    private String nombre;
    private String email;
    
    public Persona(String n, String e){
        this.nombre = n;
        this.email = e;
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
    
    public String getDatos(){
        return String.format ("Datos:%s - %s",this.nombre,this.email);
    }
 
    
    
    
}
