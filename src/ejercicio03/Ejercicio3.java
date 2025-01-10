/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PARTE1
        System.out.println("PARTE1 - tres variables arrays");
        System.out.println("===================");
        Libro libro1=new Libro("1984","G.Orswell",1949);
        Libro libro2=new Libro("LZZ001","Moby Dick","H.Melville",1851);
        Libro libro3=new Libro("50 sombras","Mike M.",2010);
        
        libro1.setIsbn("X0046");
        
        //libro1=libro2;   //esto pierde el libro1
        
        System.out.println(libro1.citaBibliografica());
        System.out.println(libro2.citaBibliografica());
        System.out.println(libro3.citaBibliografica());
        
        System.out.println("------");
        System.out.println(libro1.getIsbn());
        System.out.println(libro2.getIsbn());
        System.out.println(libro3.getIsbn());
        
        
        //PARTE2
        System.out.println("");
        System.out.println("PARTE2 - con arrays");
        System.out.println("===================");
        Libro[] listaLibros = new Libro[10];
        
        int totalLibros=0; //contador de libros
        
        //Creo el primer libro
        Libro libro=new Libro("1984","G.Orswell",1949);
        listaLibros[totalLibros]=libro;
        totalLibros++;
        
        //Creo el segundo libro
        libro=new Libro("L001","Moby Dick","H.Melville",1851);
        listaLibros[totalLibros]=libro;
        totalLibros++;
        
        //Creo el tercer libro
        libro=new Libro("50 sombras","Mike M.",2010);
        listaLibros[totalLibros]=libro;
        totalLibros++;
        
        
        for (int i = 0; i < totalLibros; i++) {
            System.out.println(listaLibros[i].citaBibliografica());
        }
        
        
        
        
        
        
        
        
        
    }
    
}
