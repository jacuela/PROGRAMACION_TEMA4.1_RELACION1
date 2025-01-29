/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Pregunta {
    private String enunciado;
    private String[] opciones;
    private char respuesta;
    private final int totalOpciones;
    
    public Pregunta(int totalOpciones){
        this.totalOpciones = totalOpciones;
        opciones = new String[totalOpciones];
    }

    public void imprimirPregunta(){
        
        char letraOpcion = 'a'; //la letra a
        
        System.out.println("PREGUNTA"+this.enunciado+":");
        for (int i = 0; i < this.totalOpciones; i++) {
            System.out.println(letraOpcion+") "+opciones[i]);
            letraOpcion++;
        }
        
        
        
        
    }
    
    
    
    
    
    public int getTotalOpciones() {
        return totalOpciones;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public char getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(char respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
    
    
    
    
}
