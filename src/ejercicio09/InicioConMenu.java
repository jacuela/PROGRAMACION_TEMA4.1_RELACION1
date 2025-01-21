/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import Utilidades.Util;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class InicioConMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int opcion;
        boolean continuar=true;
       
        ArrayList<Autor> listaAutores=new ArrayList();
        ArrayList<Libro> listaLibros=new ArrayList();
        
        //============================ DATOS EN CODIGO ==========================
        Autor autorJorge = new Autor("Jorge Javier","Vazquez","Aledo","jj@kk.com");
        listaAutores.add(autorJorge);
        
        Autor autorAlicia = new Autor("Alicia","Cano","Medina","ali@kk.com");
        listaAutores.add(autorAlicia);
        
        listaLibros.add(new Libro(Util.generarCodigoLibro(),"El hobitton",
                           autorJorge,2020));
        listaLibros.add(new Libro(Util.generarCodigoLibro(),"Mi vida bella",
                           autorAlicia,2021));
        //====================================================================
        
        
        
        do {
            System.out.println("");System.out.println("");
            
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
            
            System.out.println("");
            System.out.println("1.  Nuevo Autor");
            System.out.println("2.  Nuevo Libro");
            System.out.println("3.  Borrar Autor");
            System.out.println("4.  Borrar Libro");
            System.out.println("5.  Salir");
            
            System.out.print("Elige una opción:");
            
            opcion=Integer.parseInt(teclado.nextLine());
            System.out.println("");
            
            switch(opcion){
                case 1:
                    crearAutor(listaAutores);
                    break;
                case 2:
                    crearLibro(listaLibros,listaAutores);
                    break;
                case 3:
                    System.out.println("APELLIDO1 del autor a borrar: ");
                    String apellido = teclado.nextLine();
                    for (Autor autor : listaAutores) {
                        if (autor.getApellido1().equalsIgnoreCase(apellido)){
                            listaAutores.remove(autor);
                            break;  //una vez encontrado y borrado, ahora tiempo
                        }
                    }
                    break;
                case 4:
                    System.out.println("CODIGO del libro a borrar: ");
                    String codigo = teclado.nextLine();
                    for (Libro libro : listaLibros) {
                        if (libro.getCodigo().equalsIgnoreCase(codigo)){
                            listaLibros.remove(libro);
                            break; //una vez encontrado y borrado, ahora tiempo
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    continuar=false;
                    break;
            }
            
        } while (continuar);
        
        
        
        
    }

    private static void crearAutor(ArrayList<Autor> listaAutores) {
        //*********************************
        //Crear un nuevo autor
        //*********************************
        Scanner teclado = new Scanner (System.in);
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
            if (!Util.checkEmail(email))
                System.out.println("ERROR: email incorrecto");
        }while(!Util.checkEmail(email));    
    
        //En este punto, los parámetros son correcto
        //Creo entonces el autor
        listaAutores.add(new Autor(nombre,apellido1,apellido2,email));
        System.out.println("....autor creado");
        
    }

    private static void crearLibro(ArrayList<Libro> listaLibros, ArrayList<Autor> listaAutores ) {
        Scanner teclado=new Scanner(System.in);
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
        listaLibros.add(new Libro(Util.generarCodigoLibro(),titulo,
                           autorLibro,year));
        
    
    
    
    }
    
}
