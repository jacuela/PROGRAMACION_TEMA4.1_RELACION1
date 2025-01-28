/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enclaseEjercicio10;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class InicioSinMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche cocheVolvo = new Coche("Volvo",
                                "XC60",
                                140,
                                TipoCombustible.DIESEL,
                                TipoCambio.AUTOMATICO,
                                19
                                );
        System.out.println(cocheVolvo.getFichaSimple());

        
        
    }
    
}
