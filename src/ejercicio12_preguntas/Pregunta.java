/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_preguntas;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Pregunta {
    private String enunciado;
    private String[] opciones;
    private char respuesta;
    private final int totalOpciones;
    
    //Pregunta vacia
    public Pregunta(int totalOpciones){
        this.totalOpciones = totalOpciones;
        opciones = new String[totalOpciones];
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(char respuestaSolucion) {
        this.respuesta= respuestaSolucion;
    }

    public int getTotalOpciones() {
        return totalOpciones;
    }
    
    public void imprimirPregunta(){
        
        int letraOpcion = 97; //la letra a
        
        System.out.println("PREGUNTA:"+this.enunciado+":");
        for (int i = 0; i < this.totalOpciones; i++) {
            System.out.printf("%c) %s\n",(char)letraOpcion,opciones[i]);
            letraOpcion++; //para que en la opcion aparezca b,c....
        }
        
    }
    
    
    
}
