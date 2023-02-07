/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        TipoCombustible tipoCombus;
        TipoCambio tipoCambio;         
        
        
        //Primer coche en codigo
        Coche cocheVolvo=new Coche("VOLVO","XC60",140,
                                   TipoCombustible.DIESEL,
                                   TipoCambio.AUTOMATICO,
                                   19);
        
        //Segundo coche por teclado
        System.out.println("Creando un nuevo coche:");
        System.out.print("  Marca:");
        String marca=teclado.nextLine();
        System.out.print("  Modelo:");
        String modelo=teclado.nextLine();
        System.out.print("  Potencia(CV):");
        int potencia=Integer.parseInt(teclado.nextLine());
        
        System.out.print("  Combustible [DIESEL|GASOFA]:");
        String combustible=teclado.nextLine();
        if (combustible.equalsIgnoreCase("diesel")){
            tipoCombus=TipoCombustible.DIESEL;
        }
        else{
            tipoCombus=TipoCombustible.GASOLINA;
        }
        
        System.out.print("  Cambio [MANUAL|AUTO]:");
        String cambio=teclado.nextLine();
        if (cambio.equalsIgnoreCase("manual")){
            tipoCambio=TipoCambio.MANUAL;
        }
        else{
            tipoCambio=TipoCambio.AUTOMATICO;
        }
        
        System.out.print("  Tamaño ruedas [18\" | 19\" | 20\"]: ");
        int radio=Integer.parseInt(teclado.nextLine());
        
        Coche cochePorsche=new Coche(marca, modelo, potencia,
                                      tipoCombus,tipoCambio, radio);
        
        
        cocheVolvo.imprimirFicha();
        cochePorsche.imprimirFicha();
        
        
        cocheVolvo.recorrer(1000);
        cocheVolvo.cambiarRueda(3);
        cochePorsche.recorrer(500);
        
        cocheVolvo.imprimirFicha();
        cochePorsche.imprimirFicha();
        
        cochePorsche=null;
        cochePorsche.imprimirFicha();
        
        
        
    }
    
}
