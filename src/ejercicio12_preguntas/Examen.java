/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_preguntas;

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
    private double puntuacion;
    
    public Examen(String a){
        this.alumno = a;
        listaPreguntas = new ArrayList();
        listaRespuestas = new ArrayList();
        this.puntuacion = 0;
    }

    public String getAlumno() {
        return alumno;
    }
    
    
    public void addPregunta(Pregunta p){
        listaPreguntas.add(p);
    }
    
    
    public void responderPreguntas(){
        Scanner teclado = new Scanner(System.in);
        char respuesta;
        
        for (int i = 0; i < listaPreguntas.size(); i++) {
            listaPreguntas.get(i).imprimirPregunta();
            System.out.print("RESPUESTA: ");
            respuesta = teclado.nextLine().charAt(0);
            listaRespuestas.add(i, respuesta);
            System.out.println("");
        }
        
    }
    
    public void imprimirExamenResuelto(){
        
        //Solo puedo hacer esto si ya he respondido a las preguntas,
        //porque la lista de respuestas debe estar completa
        for (int i = 0; i < listaPreguntas.size(); i++) {
            listaPreguntas.get(i).imprimirPregunta();
            System.out.print("RESPUESTA: ");
            System.out.println(listaRespuestas.get(i));
        }
    }
    
    public double obtenerPuntuacion(){
        int totalAciertos=0;
        
        
        for (int i = 0; i < listaPreguntas.size(); i++) {
            if (listaPreguntas.get(i).getRespuesta()==listaRespuestas.get(i)){
                totalAciertos++;
            }
            
            
        }
        System.out.println("TOTAL ACIERTOS:"+totalAciertos);
        
        double cadaPreguntaVale = 10 / (double)listaPreguntas.size();
        this.puntuacion = totalAciertos * cadaPreguntaVale;
        
        return this.puntuacion;
        
        
    }
    
    
    
}
