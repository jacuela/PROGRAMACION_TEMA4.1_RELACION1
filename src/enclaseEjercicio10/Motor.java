/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclaseEjercicio10;

/**
 *
 * @author juanantoniocuelloalarcon
 */


enum TipoCambio{
    MANUAL, AUTOMATICO
}

enum TipoCombustible{
    DIESEL, GASOLINA
}

public class Motor {
    private int potencia;
    private final TipoCombustible combustible;
    private final TipoCambio cambio;
    private int km;
    
    //Constructor
    public Motor (int potencia, 
                  TipoCombustible combustible,
                  TipoCambio cambio){
        this.potencia = potencia;
        this.combustible = combustible;
        this.cambio = cambio;
        this.km = 0;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

   

    public TipoCambio getCambio() {
        return cambio;
    }

   

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
   
    
    
    
    
}
