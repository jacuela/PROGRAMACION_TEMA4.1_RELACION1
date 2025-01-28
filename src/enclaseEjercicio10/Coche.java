/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclaseEjercicio10;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda[] ruedas;
    
    public Coche(String marca,
            String modelo,
            int cv,
            TipoCombustible combustible,
            TipoCambio cambio,
            int radio
            ){
        
        this.marca = marca;
        this.modelo = modelo;
        
        //Me creo el motor
        this.motor = new Motor(cv,combustible,cambio);
        
        //Me creo las 4 ruedas
        this.ruedas = new Rueda[5]; //la 0 es la de repuesto. No la creo
        this.ruedas[1] = new Rueda(radio);
        this.ruedas[2] = new Rueda(radio);
        this.ruedas[3] = new Rueda(radio);
        this.ruedas[4] = new Rueda(radio);
        
    }
    
    public void cambiarRueda(int numRueda){
        
        if (numRueda >=1 && numRueda <=4){
            this.ruedas[numRueda].setKm(0);
        }
        else{
            System.out.println("ERROR: rueda incorrecta");
        }
    }
    
    public void recorrer(int kmRecorridos){
        //Actualizamos los km del motor
        this.motor.setKm(kmRecorridos+this.motor.getKm());
        
        //Actualizamos los km de las 4 ruedas
        this.ruedas[1].setKm(kmRecorridos+this.ruedas[1].getKm());
        this.ruedas[2].setKm(kmRecorridos+this.ruedas[2].getKm());
        this.ruedas[3].setKm(kmRecorridos+this.ruedas[3].getKm());
        this.ruedas[4].setKm(kmRecorridos+this.ruedas[4].getKm());

//        Otra opcion de hacerlo        
//        for (int i = 1; i <= 4; i++) {
//            this.ruedas[i].setKm(kmRecorridos+this.ruedas[i].getKm());
//        }
        
    }
    
    public String getFichaSimple(){
        //String ficha;
        
        String ficha = String.format("%s %s - %d %s %s",
                this.marca,
                this.modelo,
                this.motor.getPotencia(),
                this.motor.getCombustible(),
                this.motor.getCambio());
        
        return ficha;
    }
    
    
    
    
    
    
}

