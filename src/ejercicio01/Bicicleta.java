/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author juan.antonio
 */
public class Bicicleta {
    
    private int revoluciones; //velocidad de las pedaladas
    private int piñonActual;
    private final String propietario;
    
    public Bicicleta(String p){
        this.piñonActual=3;
        this.revoluciones=0;
        this.propietario=p;
    }

    public String getPropietario() {
        return this.propietario;
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
    
    public void mostrarVelocidad(){
        
        System.out.print("Bici de "+this.propietario+"-->");
        
        switch(this.piñonActual){
            case 1: //El piñon 1 dobla las revoluciones
                    System.out.println("Velocidad actual:"+(this.revoluciones*2));
                    break;
            case 2: //Multiplicador piñon: 1.5
                    System.out.println("Velocidad actual:"+(this.revoluciones*1.5));
                    break;
            case 3: //Multiplicador piñon: 1
                    System.out.println("Velocidad actual:"+(this.revoluciones*1));
                    break;
            case 4: //Multiplicador piñon: 0.5
                    System.out.println("Velocidad actual:"+(this.revoluciones*0.5));
                    break;
            case 5: //Multiplicador piñon: 0.3
                    System.out.println("Velocidad actual:"+(this.revoluciones*0.3));
                    break;
           }
        
        
    }
    
    
    public double obtenerVelocidad(){
        
        double velocidad=0;
        
        switch(this.piñonActual){
            case 1: //El piñon 1 dobla las revoluciones
                    velocidad=this.revoluciones*2;
                    break;
            case 2: //Multiplicador piñon: 1.5
                    velocidad=this.revoluciones*1.5;
                    break;
            case 3: //Multiplicador piñon: 1
                    velocidad=this.revoluciones*1;
                    break;
            case 4: //Multiplicador piñon: 0.5
                    velocidad=this.revoluciones*0.5;
                    break;
            case 5: //Multiplicador piñon: 0.3
                    velocidad=this.revoluciones*0.3;
                    break;
           }
        
        return velocidad;
        
    }
    
    
}
