/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ventanas;

/**
 *
 * @author juan.antonio
 */
class Rueda {
    
    private int radio;
    private int km;

    public Rueda(int radio) {
        this.radio = radio;
        this.km = 0;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
}
