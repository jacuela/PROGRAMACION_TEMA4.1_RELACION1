/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Examen {
    private String alumno;
    private ArrayList<Pregunta> listaPreguntas;
    private ArrayList<Character> listaRespuestas;
    private double calificacion;
    
    public Examen(String alumno){
        this.alumno = alumno;
        this.calificacion = 0;
        this.listaPreguntas = new ArrayList();
        this.listaRespuestas = new ArrayList();
    }

    public String getAlumno() {
        return alumno;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    public void addPregunta(Pregunta p){
        this.listaPreguntas.add(p);
    }
    
    public void responderPreguntas(){
        Scanner teclado = new Scanner(System.in);
        char respuesta;
        
        //Imprimimos las preguntas
        for (Pregunta p : listaPreguntas) {
            p.imprimirPregunta();
            System.out.print("RESPUESTA:");
            respuesta = teclado.nextLine().charAt(0);
            this.listaRespuestas.add(respuesta);
        }
        
        
        
        
        
    }
    
    
}
