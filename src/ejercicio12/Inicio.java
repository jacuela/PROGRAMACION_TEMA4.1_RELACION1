/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pregunta pregunta;
        String [] opciones;
        
        Examen examen = new Examen("Pablo Motos");
        
        
        
        pregunta = new Pregunta(3);
        pregunta.setEnunciado("Cuanto es 2+2");
        //Respuestas
        opciones = new String[pregunta.getTotalOpciones()];
        opciones[0]="3";
        opciones[1]="4";
        opciones[2]="5";
        pregunta.setOpciones(opciones);
        pregunta.setRespuesta('b');
        examen.addPregunta(pregunta); //añadir la pregunta al examen
        //pregunta.imprimirPregunta();
        
        //.......
        
        examen.responderPreguntas();
        
        
        
        
        
        
        
        
    }
    
}
