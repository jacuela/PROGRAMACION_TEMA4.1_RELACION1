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
        
        
        //PARTE 1 - USANDO 3 VARIABLES
//        Libro libro1=new Libro("1984","G.Orswell",1949);
//        Libro libro2=new Libro("L001","Moby Dick","H.Melville",1851);
//        Libro libro3=new Libro("50 sombras","Mike M.",2010);
//        
//        libro1.setIsbn("L002");
//        
//        System.out.println(libro1.citaBibliografica());
//        System.out.println(libro2.citaBibliografica());
//        System.out.println(libro3.citaBibliografica());
//        
//        
//        System.out.println(libro1.getIsbn());
//        System.out.println(libro2.getIsbn());
//        System.out.println(libro3.getIsbn());
        
        //PARTE 2 - USANDO UN ARRAY
        Libro [] listaLibros=new Libro[10];
        
        Libro unLibro;
        int totalLibros=0; //variable aux para llevar el conteo
        
        unLibro=new Libro("1984","G.Orswell",1949);
        listaLibros[totalLibros]=unLibro;
        //Otra forma ahorrando la variable unLibro
        //listaLibros[totalLibros]=new Libro("1984","G.Orswell",1949);
        totalLibros++;
        
        unLibro=new Libro("L001","Moby Dick","H.Melville",1851);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
         
        unLibro=new Libro("50 sombras","Mike M.",2010);
        listaLibros[totalLibros]=unLibro;
        totalLibros++;
         
        listaLibros[0].setIsbn("X00");
        
        
        //Imprimo la cita de todos los libros
        for (int i = 0; i < totalLibros; i++) {
            System.out.println(listaLibros[i].citaBibliografica());
        }
        
        //Imprimo el ISBN de todos los libros
        for (int i = 0; i < totalLibros; i++) {
            System.out.println(listaLibros[i].getIsbn());
        }
        
        
        
        
        
        
        
    }
    
}
