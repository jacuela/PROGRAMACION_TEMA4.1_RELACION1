/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ventanas;

import java.util.Scanner;


enum TipoCambio{
    MANUAL, AUTOMATICO
}


enum TipoCombustible{
    GASOLINA, DIESEL
}


/**
 *
 * @author juan.antonio
 */
public class Motor {
        
    private int cv;
    private TipoCombustible combustible;
    private TipoCambio tipoCambio;
    private int km;
    
    public Motor(int cv, TipoCombustible combustible, TipoCambio tipoCambio) {
        this.cv = cv;
        this.combustible = combustible;
        this.tipoCambio = tipoCambio;
        this.km=0;
    }

  
    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoCambio getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(TipoCambio tipoCambio) {
        this.tipoCambio = tipoCambio;
    }


    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    
    
    
    
    
    
    
}
