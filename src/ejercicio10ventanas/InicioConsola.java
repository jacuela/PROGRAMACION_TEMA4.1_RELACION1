/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10ventanas;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class InicioConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        String marca,modelo;
        int cv;
        String combustible,cambio;
        TipoCombustible tipoCombustible;
        TipoCambio tipoCambio;
        int tamRuedas;
        
        
        //Meto el primer coche en codigo para agilizar
        Coche cocheVolvo=new Coche("VOLVO","XC60",140,
                        TipoCombustible.DIESEL,
                        TipoCambio.AUTOMATICO,
                        19);
        
        
        
//        //Meto el segundo coche en codigo para agilizar
//        Coche cochePorsche=new Coche("PORSCHE","911",250,
//                        TipoCombustible.GASOLINA,
//                        TipoCambio.MANUAL,
//                        22);
//        
//        
        
        
        ////Meto el segundo coche con interfaz de entrada
        System.out.println("Marca: ");
        marca=teclado.nextLine();
        System.out.println("Modelo: ");
        modelo=teclado.nextLine();
        System.out.println("Potencia (CV): ");
        cv=Integer.parseInt(teclado.nextLine());
        System.out.println("Combustible [DIESEL | GASOFA]: ");
        combustible=teclado.nextLine();
        System.out.println("Cambio [MANUAL | AUTOMATICO]: ");
        cambio=teclado.nextLine();
        System.out.println("Tamaño ruedas [18\" | 19\" | 20\" | OTRO]: ");
        tamRuedas=Integer.parseInt(teclado.nextLine());
        
        if (combustible.equals("DIESEL"))
            tipoCombustible=TipoCombustible.DIESEL;
        else
            tipoCombustible=TipoCombustible.GASOLINA;
            
        if (cambio.equals("MANUAL"))
            tipoCambio=TipoCambio.MANUAL;
        else
            tipoCambio=TipoCambio.AUTOMATICO;
          
        
        Coche cochePorsche=new Coche(marca,modelo,cv,tipoCombustible,tipoCambio,tamRuedas);
        
        
       
    //    System.out.println(cocheVolvo.getFichaSimplicada());
    //    System.out.println(cochePorsche.getFichaSimplicada());
        
        
        cocheVolvo.imprimirFicha();
        cochePorsche.imprimirFicha();
        
        
        cocheVolvo.recorrer(10000);
        cocheVolvo.cambiarRueda(4);
        cochePorsche.recorrer(500);
        
        cocheVolvo.imprimirFicha();
        cochePorsche.imprimirFicha();
       
        
        cocheVolvo=null;
        
        System.out.println("************************************************"); 
        System.out.println("!!!Ahora va a fallar porque he perdido el coche");
        System.out.println("Al borrarlo, no hay rastro de sus ruedas y su motor");
        System.out.println("************************************************"); 
        
        System.out.println(cochePorsche.getFichaSimplicada());
        //System.out.println(cocheVolvo.getFichaSimplicada());
        
        
    }
    
}
