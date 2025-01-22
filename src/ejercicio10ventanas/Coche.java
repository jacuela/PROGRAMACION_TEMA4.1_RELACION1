/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ventanas;

import java.util.Scanner;

/**
 *
 * @author juan.antonio
 */
public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda[]ruedas; //=new Rueda[4];
    
    public Coche(String marca, String modelo,
                        int cv, 
                        TipoCombustible tipoCombustible,
                        TipoCambio tipoCambio,
                        int radioRueda){
        
        this.marca=marca;
        this.modelo=modelo;
        this.motor=new Motor(cv,tipoCombustible,tipoCambio);
      
        this.ruedas=new Rueda[4];
        this.ruedas[0]=new Rueda(radioRueda);
        this.ruedas[1]=new Rueda(radioRueda);
        this.ruedas[2]=new Rueda(radioRueda);
        this.ruedas[3]=new Rueda(radioRueda);
        
    }
    
    public String getFichaSimplicada(){
        String ficha="";
        
        ficha=String.format("%s %s - %d %s %s",
                            this.marca,
                            this.modelo,
                            this.motor.getCv(),
                            this.motor.getCombustible(),
                            this.motor.getTipoCambio()
                            );
        return ficha;
    }
    
    public void recorrer(int km){
        int kmActuales=this.motor.getKm();
        this.motor.setKm(kmActuales+km);
        
        this.ruedas[0].setKm(this.ruedas[0].getKm()+km);
        this.ruedas[1].setKm(this.ruedas[1].getKm()+km);
        this.ruedas[2].setKm(this.ruedas[2].getKm()+km);
        this.ruedas[3].setKm(this.ruedas[3].getKm()+km);
    
    }
  
    public void cambiarRueda(int numrueda){
        
        if (numrueda>=1 && numrueda<=4){
            //Num rueda debe ser un numero
            //entre 1 y 4
            this.ruedas[numrueda-1].setKm(0);
        }
        else
            System.out.println("!!!!Rueda incorrecta");
    }
    
    public void imprimirFicha(){
        System.out.println("");
        System.out.println("Ficha del coche");
        System.out.println("===================================================");
        System.out.println("Marca/Modelo: "+this.marca+" "+this.modelo);
        System.out.println("Motor(CV): "+this.motor.getCv());
        System.out.println("Combustible: "+this.motor.getCombustible());
        System.out.println("Cambio: "+this.motor.getTipoCambio());
        System.out.println("KM del motor: "+this.motor.getKm()+" km");
        System.out.println("Tamaño ruedas: "+this.ruedas[0].getRadio()+"\"");
        System.out.printf("KM de las ruedas:[%d]  [%d]  [%d]  [%d]",this.ruedas[0].getKm(),
                                                                    this.ruedas[1].getKm(),
                                                                    this.ruedas[2].getKm(),
                                                                    this.ruedas[3].getKm());
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        
    }
    
    
    
}
