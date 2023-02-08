/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Factura {
    private String cif;
    private String fecha;
    private ArrayList<LineaFactura> lineas;
    private final double IVA;

    public Factura(String cif, String fecha) {
        this.cif = cif;
        this.fecha = fecha;
        lineas=new ArrayList<>();
        IVA=21;
        
        
        //Aqúi voy a añadir las 2 primeras lineas para tener datos metidos
        LineaFactura l1=new LineaFactura("REF004","Barra de pan",2,0.80);
        this.lineas.add(l1);
        this.lineas.add(new LineaFactura("REF001","Leche",1,1.5));
        
        System.out.println("....... 2 lineas añadida (en el constructor)");
        
        
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getIVA() {
        return IVA;
    }

    
    public void añadirLinea(){
        Scanner teclado=new Scanner(System.in);
        
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
        
        this.lineas.add(new LineaFactura(ref,descripcion,cantidad,precioUnidad));
        System.out.println(".......linea añadida");
        
    }
    
    private double getSubtotal(){
        double subtotal=0;
        for (LineaFactura linea : lineas) {
            subtotal=subtotal+linea.getImporteLinea();
        }
        
        
        return subtotal;
    }
    
    private double getIVAsubtotal(){
        return this.getSubtotal()*(this.IVA/100);
    }
    
    private double getTotal(){
        return this.getSubtotal()+this.getIVAsubtotal();
    }
    
    
    public void imprimirFactura(){
        System.out.println("===================================================");
        System.out.println("                 FACTURA");
        System.out.println("CIF:   "+this.cif);
        System.out.println("Fecha: "+this.fecha);
        System.out.println("");
        System.out.println("CANT    DESCRIPCION   PRECIO U    IMPORTE");
        System.out.println("---------------------------------------------");
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("");
        System.out.printf("                          Subtotal: %.2f €\n",this.getSubtotal());
        System.out.printf("                          IVA %.0f:   %.2f €\n",this.IVA,this.getIVAsubtotal());
        System.out.printf("                          TOTAL:    %.2f €\n",this.getTotal());
        System.out.println("===================================================");
    }
    
    
    
    
    
    
    
    
    
    
    
}
