/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author juan.antonio
 */
public class Bicicleta {
    
    private int revoluciones; //velocidad de las pedaladas
    private int piñonActual;
    
    public Bicicleta(){
        piñonActual=3;
        revoluciones=0;
        
    }

    
    
    public void pedalear(){
        if (this.revoluciones==0){
            //estoy parada
            this.revoluciones=1;
        }    
        else{
            this.revoluciones=this.revoluciones*2;
        }
    }
    
    public void frenar(){
        if (this.revoluciones==1){
            //estoy al minimo. Me paro
            this.revoluciones=0;
        }    
        else{
            this.revoluciones=this.revoluciones/2;
        }
        
    }
    
    public void cambiarPiñon(int piñon){
        if (piñon>=1 && piñon<=5){
            this.piñonActual=piñon;
        }
        else
            System.out.println("ERROR: Piñon erroneo.");
    }
    
   
    
    
    
}
