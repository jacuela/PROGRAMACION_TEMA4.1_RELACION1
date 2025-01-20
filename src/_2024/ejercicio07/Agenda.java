/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _2024.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Agenda {
    private ArrayList<Contacto> listaContactos; // = new ArrayList();
    private int contadorId;
    
    public Agenda(){
        this.contadorId = 1;
        this.listaContactos = new ArrayList();
    }
    
    public void addContacto(String nombre, String email, String tel){
        
        Contacto contacto = new Contacto (this.contadorId,nombre,email,tel);
        listaContactos.add(contacto);
        this.contadorId++;
        
    }
    
    public void listarAgenda(){
        System.out.println("  ID     NOMBRE          EMAIL        TELE");
        System.out.println("================================================");
        for (Contacto unContacto:listaContactos){
            System.out.println(unContacto.aCadena());
        }

    }
    
    public void modificarContacto(int id){
        for (Contacto c:listaContactos){
            if (c.getId()==id){
                //c es el contacto a modificar
                modificarContacto(c);
                return;
            }
        }
        
        System.out.println("ERROR: no existe dicho ID");
        
    } 
    
    //Metodo que pregunta por el campo del contacto a modificar
    //y lo modifica
    private void modificarContacto(Contacto c){
        Scanner teclado = new Scanner (System.in);
        System.out.println(c.aCadena());
        String campo;
      
        System.out.println("Qué quieres modificar??? [nombre | email | telefono] ");
        campo = teclado.nextLine();
        
        if (campo.equalsIgnoreCase("nombre")){
            System.out.print("Nuevo nombre:");
            String nuevoNombre = teclado.nextLine();
            c.setNombre(nuevoNombre);
        }
        else if (campo.equalsIgnoreCase("email")){
            System.out.print("Nuevo email:");
            String nuevoEmail = teclado.nextLine();
            c.setEmail(nuevoEmail);
        }
        else if (campo.equalsIgnoreCase("telefono")){
            System.out.print("Nuevo telefono:");
            String nuevoTelefono = teclado.nextLine();
            c.setTelefono(nuevoTelefono);
        }
        else{
            System.out.println("ERROR: no existe dicho campo");
        }
    }
    
    
    
    
    
    
    
    
    
    
}
