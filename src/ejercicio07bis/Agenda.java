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
 * @author Juan Antonio Cuello
 */
public class Agenda {
    
   private ArrayList<Contacto> listaContactos;   //=new ArrayList();
   
   public Agenda(){
       this.listaContactos=new ArrayList();
   }
   
   public void addContacto(String nombre, String email, String telefono){
            listaContactos.add(new Contacto(nombre,email,telefono));
   }
   
   public void listarAgenda(){
       
        System.out.println("=========== LISTA DE CONTACTOS =================");
        System.out.println("ID       NOMBRE         EMAIL         TELEFONO");
            
        for (Contacto contacto : listaContactos) {
            System.out.println(contacto.aCadena());
        }
        
        System.out.println("================================================");
   }
           
   
   public Contacto obtenerContacto(int id){
       for (Contacto c : listaContactos) {
           if (c.getId()==id){
               return c;
           }
           
       }
       return null;
   }

      
   public ArrayList<Contacto> buscarContacto(String expresion){
       //Aquí programamos la buscado de nombres usand una expresión regular
       //usando comodines
       //    Ju —> Juan / Julio / Juanjo
       //    P —> Paco / Pedro / Perico
       
       ArrayList<Contacto> listaCoincidencias=new ArrayList();
       
       expresion=expresion.toLowerCase();
      
       for (int i = 0; i < listaContactos.size(); i++) {
           if (listaContactos.get(i).getNombre().toLowerCase().startsWith(expresion)){
               //El contacto actual comienza por la expresion
               listaCoincidencias.add(listaContactos.get(i));
           }
       }
       return listaCoincidencias;
       
   }
    
    
}
