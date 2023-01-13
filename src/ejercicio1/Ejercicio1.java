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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicicleta miBici=new Bicicleta("Juan");
        Bicicleta tuBici=new Bicicleta("Alicia");
        
        miBici.pedalear();
        miBici.pedalear();
        miBici.cambiarPiñon(2);
        
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.cambiarPiñon(6);
        
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.cambiarPiñon(5);
        miBici.mostrarVelocidad();
        tuBici.mostrarVelocidad();
        
        miBici.obtenerVelocidad();
        
        System.out.println("--------------------");
        System.out.println(miBici.getPropietario()+"-->"+miBici.obtenerVelocidad()+" km/h");
        System.out.printf("%s: %.2f km/h\n",tuBici.getPropietario(),tuBici.obtenerVelocidad());
        
        
        
        
        
        
        
    }
    
}
