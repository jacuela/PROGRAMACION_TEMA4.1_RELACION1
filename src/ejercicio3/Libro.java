/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author juan.antonio
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    
    //Primer constructor
    public Libro(String isbn, String tit, String aut, int year){
        this.isbn=isbn;
        this.titulo=tit;
        this.autor=aut;
        this.año=year;
    }
    
    //Segundo constructor
    public Libro(String tit, String aut, int year){
        this.isbn=null;
        this.titulo=tit;
        this.autor=aut;
        this.año=year;
    }

    public String getIsbn() {
       
        String isbnNulo;
        
        if (this.isbn==null){
            isbnNulo=String.format("***[%s] no tiene ISBN***", this.titulo);
            //isbnNulo="***["+this.titulo+"] no tiene ISBN***";
            return isbnNulo;
        }
        else{
            return isbn;
        }
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String citaBibliografica(){
        String cita;
        
        cita=String.format("%s, (%d), %s",this.autor,this.año,this.titulo);
        
        return cita;
        
    }
    
    
    
    
    
}
