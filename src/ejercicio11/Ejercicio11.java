/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factura factura1=new Factura("B30341111","03/03/2022");
        
        factura1.añadirLinea();
        factura1.imprimirFactura();
        
        
    }
    
}
