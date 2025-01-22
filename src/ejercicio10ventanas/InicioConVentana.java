/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan.antonio
 */
public class InicioConVentana {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche coche1=null;
      
        VentanaNuevoCoche ventana=new VentanaNuevoCoche();
 
        coche1=ventana.devolverDatos();
        
        System.out.println(coche1.getFichaSimplicada());
        coche1.imprimirFicha();
        
        
        
        
        
        System.out.println("El coche recorre 10.000 km");
        coche1.recorrer(10000);
        System.out.println("El coche pincha y cambia rueda 4");
        coche1.cambiarRueda(4);
        System.out.println("El coche recorre 2.000 km");
        coche1.recorrer(2000);
        coche1.imprimirFicha();
        
    }
    
}
