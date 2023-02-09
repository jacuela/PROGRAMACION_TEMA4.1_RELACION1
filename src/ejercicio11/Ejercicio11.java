/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.time.LocalDate;
import java.util.Scanner;

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
        Scanner teclado=new Scanner(System.in);
        
        Factura factura1=new Factura("B30341111",LocalDate.now());
        
        //Aqúi voy a añadir las 2 primeras lineas para tener datos metidos
        factura1.añadirLinea("REF004","Barra de pan",2,0.80);
        factura1.añadirLinea("REF001","Leche",1,1.5);
        
        factura1.imprimirFactura();
        
        
        //PROGRAMO AHORA LA PEDIDA DE DATOS
        System.out.println("Añadiendo uan nueva linea....");
        System.out.println(".............................");
        System.out.print("Ref: ");
        String ref=teclado.nextLine();
        System.out.print("Descripcion: ");
        String descripcion=teclado.nextLine();
        System.out.print("Cantidad: ");
        int cantidad=Integer.parseInt(teclado.nextLine());
        System.out.print("Precio Unidad: ");
        double precioUnidad=Double.parseDouble(teclado.nextLine());
        
        factura1.añadirLinea(ref,descripcion,cantidad,precioUnidad);
        
        factura1.imprimirFactura();
        
        
    }
    
}
