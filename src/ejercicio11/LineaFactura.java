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
public class LineaFactura {
    
    private String ref;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double importeLinea;

    public LineaFactura(String ref, String descripcion, int cantidad, double precioUnitario) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importeLinea=this.cantidad*this.precioUnitario;
        
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    
    public void imprimirLinea(){
        System.out.printf("%3d   %-15s %-10.2f %5.2f\n",this.cantidad,this.descripcion,this.precioUnitario,this.importeLinea);
    }
    
    
    
    
    
    
}
