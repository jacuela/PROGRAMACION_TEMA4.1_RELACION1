/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

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
        
        this.isbn = isbn;
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

    //Getter and Setter

    public String getIsbn() {
        
        if (this.isbn==null){
            return String.format("*** [%s] no tiene ISBN ***", this.titulo);
        }
        return isbn;
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
    
    private boolean checkISBN(){
        
        
    }
    
    
    
    
    
    
    
}

//
//
//    private String isbn;
//    private String titulo;
//    private String autor;
//    private int año;
//    
//    //Primer constructor
//    public Libro(String isbn, String tit, String aut, int year){
//        
//        if (this.checkISBN(isbn)){
//           isbn=isbn.toUpperCase(); //lo paso a mayusculas
//           this.isbn = isbn;
//        }
//        else{
//           System.out.println("ERROR: isbn incorrecto"); 
//        }
//        
//        this.titulo=tit;
//        this.autor=aut;
//        this.año=year;
//    }
//    
//    //Segundo constructor
//    public Libro(String tit, String aut, int year){
//        this.isbn=null;
//        this.titulo=tit;
//        this.autor=aut;
//        this.año=year;
//    }
//
//    public String getIsbn() {
//       
//        String isbnNulo;
//        
//        if (this.isbn==null){
//            isbnNulo=String.format("***[%s] no tiene ISBN***", this.titulo);
//            //isbnNulo="***["+this.titulo+"] no tiene ISBN***";
//            return isbnNulo;
//        }
//        else{
//            return isbn;
//        }
//    }
//
//    public void setIsbn(String isbn) {
//        
//        if (this.checkISBN(isbn)){
//           isbn=isbn.toUpperCase(); //lo paso a mayusculas
//           this.isbn = isbn;
//        }
//        else{
//           System.out.println("ERROR: isbn incorrecto"); 
//        }
//       
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//
//    public void setAutor(String autor) {
//        this.autor = autor;
//    }
//
//    public int getAño() {
//        return año;
//    }
//
//    public void setAño(int año) {
//        this.año = año;
//    }
//    
//    public String citaBibliografica(){
//        String cita;
//        
//        cita=String.format("%s, (%d), %s",this.autor,this.año,this.titulo);
//        
//        return cita;
//        
//    }
//    
//    private boolean checkISBN(String isbn){
//        isbn=isbn.toUpperCase(); //lo paso a mayusculas
//        
//        boolean isbnCorrecto=true;
//        
//        //Comprobacion1: Compruebo que el ISBN tiene formato correcto
//        if (isbn.length()!=4) isbnCorrecto=false;
//        else{
//            //Comprobacion2: que el primer caracter sea una letra entre 
//            //la A y la Z
//
//            char letra=isbn.charAt(0);
//            if (letra <'A' || letra>'Z') isbnCorrecto=false;
//
//            //Comprobacion3,4,5: que los siguientes caracteres sean
//            //numeros
//            char digito1=isbn.charAt(1);
//            if (digito1 <'0' || digito1>'9') isbnCorrecto=false;
//
//            char digito2=isbn.charAt(2);
//            if (digito2 <'0' || digito2>'9') isbnCorrecto=false;
//
//            char digito3=isbn.charAt(3);
//            if (digito3 <'0' || digito3>'9') isbnCorrecto=false;
//        }
//        //Compruebo el booleano y devuelvo true o false
//        if (isbnCorrecto==false){
//            return false;
//        }
//        else{
//           return true;
//        }
//        
//        //OPCIONALMENRE -->   return isbnCorrecto;
//        
//    }
//    
//    
//    
//    
//}
