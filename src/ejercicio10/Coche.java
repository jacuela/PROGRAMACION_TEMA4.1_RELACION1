/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author juan.antonio
 */
public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda[] ruedas; //=new Rueda[5]
    
    public Coche(String marca, String modelo,
                 int cv, TipoCombustible combus, TipoCambio cambio,
                 int radio){
        
        this.marca=marca;
        this.modelo=modelo;
     
        //Me creo el motor
        this.motor=new Motor(cv,combus,cambio);
        
        //Me creo las 4 ruedas. El array es de 5 elmentos para
        //acceder directamente a cada rueda con su indice
        //rueda 1 --> frontal izda
        //rueda 2 --> frontal derecha
        //...
        this.ruedas=new Rueda[5];
        this.ruedas[1]=new Rueda(radio);
        this.ruedas[2]=new Rueda(radio);
        this.ruedas[3]=new Rueda(radio);
        this.ruedas[4]=new Rueda(radio);
        
    }
    
    public void cambiarRueda(int numRueda){
        //Resetea a 0 los kilometros de una rueda
        if (numRueda>=1 && numRueda<=4){
            this.ruedas[numRueda].setKm(0);
        }
        else{
            System.out.println("ERROR: rueda incorrecta");
        }
    }
    
    public void recorrer(int kmRecorridos){
        
        //Actualizo km del motor
        int kmActuales=this.motor.getKm();
        this.motor.setKm(kmActuales+kmRecorridos);
        
        //Actualizar km de las 4 ruedas
        this.ruedas[1].setKm(this.ruedas[1].getKm()+kmRecorridos);
        this.ruedas[2].setKm(this.ruedas[2].getKm()+kmRecorridos);
        this.ruedas[3].setKm(this.ruedas[3].getKm()+kmRecorridos);
        this.ruedas[4].setKm(this.ruedas[4].getKm()+kmRecorridos);
    }
    
    public void imprimirFicha(){
        System.out.println("");
        //System.out.println("Ficha del coche");
        System.out.println("=================================");
        System.out.println("Marca/modelo: "+this.marca+" "+this.modelo);
        System.out.println("Motor(CV): "+this.motor.getPotencia());
        System.out.println("Combustible: "+this.motor.getCombustible());
        System.out.println("Cambio: "+this.motor.getCambio());
        System.out.println("Km del motor: "+this.motor.getKm()+"km");
        System.out.println("Tamaño ruedas: "+this.ruedas[1].getRadio()+"\"");
        System.out.printf("Km de las ruedas: [%d] [%d] [%d] [%d]\n",this.ruedas[1].getKm(),
                                                                  this.ruedas[2].getKm(),
                                                                  this.ruedas[3].getKm(),
                                                                  this.ruedas[4].getKm());
        System.out.println("=================================");
        System.out.println("");
    }
    
     public String getFichaSimplicada(){
        String ficha="";
        
        ficha=String.format("%s %s - %d %s %s",
                            this.marca,
                            this.modelo,
                            this.motor.getPotencia(),
                            this.motor.getCombustible(),
                            this.motor.getCambio()
                            );
        return ficha;
    }
    
    
}
