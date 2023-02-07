/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;


/**
 *
 * @author juan.antonio
 */

enum TipoCambio{
    MANUAL,AUTOMATICO
}

enum TipoCombustible{
    DIESEL,GASOLINA
}


public class Motor {
    private int potencia;
    private TipoCombustible combustible;
    private TipoCambio cambio;
    private int km;
    
    public Motor(int potencia, TipoCombustible combustible, 
            TipoCambio cambio){
        this.potencia=potencia;
        this.combustible=combustible;
        this.cambio=cambio;
        this.km=0;
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

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoCambio getCambio() {
        return cambio;
    }

    public void setCambio(TipoCambio cambio) {
        this.cambio = cambio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    
    
    
    
    
}
