/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author juan.antonio
 */
public class Cubo {
    private final int capacidadMaxima;
    private int contenido;
    
    public Cubo(int capacidad){
        this.capacidadMaxima = capacidad;
        this.contenido = 0;
        
        
        
    }
    
    //Getter and Setter
    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    //--------------------------
    
    //LLenamos al completo el cubo
    public void llenar(){
        this.contenido = this.capacidadMaxima;
       
    }
    
    public void vaciar(){
        this.contenido = 0;
        
        
    }
    
    public void rellenar(int litros){
        
        if ((this.contenido + litros) > this.capacidadMaxima){
            System.out.println("ERROR: se desborda.");
        }
        else{
            this.contenido = this.contenido + litros;
        }
        
        
    }
    
    public void pintar(){
        for (int nivel = this.capacidadMaxima; nivel > 0; nivel--) {
            if (this.contenido >=nivel){
                System.out.println("#~~~~~~#");
            }    
            else{
                System.out.println("#      #"); 
            }    
        }
        System.out.println("########");
        System.out.println("");
     
        
    }
        
        
    }
    
    
    
    
    
    
    
    
    