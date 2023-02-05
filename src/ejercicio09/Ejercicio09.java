/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

import java.util.ArrayList;
import java.util.Scanner;

import Utilidades.Utilidades;
/**
 *
 * @author juan.antonio
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        ArrayList<Autor> listaAutores=new ArrayList();
        ArrayList<Libro> listaLibros=new ArrayList();
        
        
        listaAutores.add(new Autor("Jorge Javier","Vazquez","Aledo","jj@kk.com"));
        listaAutores.add(new Autor("Alicia","Cano","Medina","ali@kk.com"));
        
        
        listaLibros.add(new Libro(Utilidades.generarCodigoLibro(),"El hobitton",
                           listaAutores.get(0),2020));
        
        
        listaLibros.add(new Libro(Utilidades.generarCodigoLibro(),"Mi vida bella",
                           listaAutores.get(1),2021));
         
        
        //========================================================
        //Listamos
        System.out.println("");
        System.out.println("LISTA AUTORES ["+listaAutores.size()+"]");
        System.out.println("==================");
        for (Autor unAutor : listaAutores) {
            System.out.println(unAutor.getNombreCita());
        }
        
        System.out.println("");
        System.out.println("LISTA LIBROS ["+listaLibros.size()+"]");
        System.out.println("=================");
        for (Libro unLibro : listaLibros) {
            System.out.println(unLibro.getCita());
        }
        
        
        //*********************************
        //Crear un nuevo autor
        //*********************************
        System.out.println("");
        System.out.println("Introducir nuevo autor");
        System.out.println("======================");
        System.out.print("Nombre:");
        String nombre=teclado.nextLine();
        System.out.print("Apellido1:");
        String apellido1=teclado.nextLine();
        System.out.print("Apellido2:");
        String apellido2=teclado.nextLine();
       
        String email;
        do {
            System.out.print("E-mail:");
            email=teclado.nextLine();
            if (!Utilidades.checkEmail(email))
                System.out.println("ERROR: email incorrecto");
        }while(!Utilidades.checkEmail(email));    
    
        //En este punto, los parámetros son correcto
        //Creo entonces el autor
        listaAutores.add(new Autor(nombre,apellido1,apellido2,email));
        
        System.out.println("");
        System.out.println("LISTA AUTORES ["+listaAutores.size()+"]");
        System.out.println("==================");
        for (Autor unAutor : listaAutores) {
            System.out.println(unAutor.getNombreCita());
        }
        
        
        
        //*********************************
        //Pedir por teclado un nuevo libro
        //*********************************
        System.out.println("");
        System.out.println("Introducir nuevo libro");
        System.out.println("======================");
        System.out.print("Titulo:");
        String titulo=teclado.nextLine();
        System.out.print("Año:");
        int year=Integer.parseInt(teclado.nextLine());
        
        Autor autorLibro=null;

        do{
            System.out.print("Apellido del autor:");
            String apellidoAutor=teclado.nextLine();
        
            for (Autor unAutor : listaAutores) {
                if (unAutor.getApellido1().equalsIgnoreCase(apellidoAutor)){
                    autorLibro=unAutor;
                    break;
                }

            }
            if (autorLibro==null){
                System.out.println("   ERROR: no existe ducho autor.");
            }
        }while(autorLibro==null);

        //Si llego aquí, he encontrado el autor correctamente
        listaLibros.add(new Libro(Utilidades.generarCodigoLibro(),titulo,
                           autorLibro,year));
        
        System.out.println("");
        System.out.println("LISTA LIBROS ["+listaLibros.size()+"]");
        System.out.println("=================");
        for (Libro unLibro : listaLibros) {
            System.out.println(unLibro.getCita());
        }
        
        
        
    }
    
}
