/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07bis;

import ejercicio07.*;


/**
 *
 * @author Juan Antonio Cuello
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    
    private static int contadorID=1;

    public Contacto(String nombre, String email, String telefono) {
        this.id = Contacto.contadorID;
        Contacto.contadorID++;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Contacto.contadorID = contadorID;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String aCadena(){
        //Imprimo en una sola linea los datos del contacto
        return String.format("%-4d %10s %20s %10s",id,nombre,email,telefono);
    }
}
