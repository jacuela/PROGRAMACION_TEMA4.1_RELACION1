/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

/**
 *
 * @author juan.antonio
 */
public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;

    public Libro(String codigo, String titulo, Autor autor, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    
        
    public String getCita(){
        String cita;
        
        cita=String.format("%s - %s (%d) - %s",this.codigo,
                                             this.titulo,
                                             this.año,
                                             autor.getNombreCita());
        
        return cita;
    }
}
