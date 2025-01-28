/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_preguntas;

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
        String[] opciones;
        
        
        Examen examen = new Examen ("Pablo Motos");
        
        
        
        
//        for (int i = 0; i < opciones.length; i++) {
//            opciones[i]="xxx";
//        }
        
        //===========IMPORTANTE====================
        //cada pregunta tiene que tener su =new porque sino,
        //no crea otra pregunta y se pierde la anterior
        //=========================================

        
        pregunta = new Pregunta(3);        
        pregunta.setEnunciado("Cuanto es 2+3");
        //Respuestas
        opciones = new String[pregunta.getTotalOpciones()];
        opciones[0]="2";
        opciones[1]="5";
        opciones[2]="6";
        pregunta.setOpciones(opciones);
        pregunta.setRespuesta('b');
        //pregunta.imprimirPregunta();
        examen.addPregunta(pregunta);
        
        pregunta = new Pregunta(3); 
        pregunta.setEnunciado("Capital de España");
        //Respuestas
        opciones = new String[pregunta.getTotalOpciones()];
        opciones[0]="Murcia";
        opciones[1]="Sevilla";
        opciones[2]="Madrid";
        pregunta.setOpciones(opciones);
        pregunta.setRespuesta('c');
        //pregunta.imprimirPregunta();
        examen.addPregunta(pregunta);
        
        pregunta = new Pregunta(3); 
        pregunta.setEnunciado("Quien escribio el Quijote");
        //Respuestas
        opciones = new String[pregunta.getTotalOpciones()];
        opciones[0]="Cervantes";
        opciones[1]="Tolkien";
        opciones[2]="Perez Reverte";
        pregunta.setOpciones(opciones);
        pregunta.setRespuesta('c');
        //pregunta.imprimirPregunta();
        examen.addPregunta(pregunta);
        
        
        
        //---------------------------------------------
        
        examen.responderPreguntas();
        System.out.println("-----");
        System.out.printf("%s ha obtenido un %.2f\n",
                        examen.getAlumno(),examen.obtenerPuntuacion());
        
        
    }
    
}
