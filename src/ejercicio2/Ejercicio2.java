/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cubo unCubo=new Cubo(5);
        
        unCubo.pintar();
        unCubo.rellenar(4);
        unCubo.pintar();
        unCubo.rellenar(2);
        unCubo.pintar();
        unCubo.vaciar();
        unCubo.pintar();
        
        
    }
    
}
