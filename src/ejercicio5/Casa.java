/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author juan.antonio
 */
public class Casa {
    
    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    private double precioVenta;

    public Casa(String propietario, int superficiePlanta1, int superficiePlanta2, double precioVenta) {
        this.propietario = propietario;
        this.superficiePlanta1 = superficiePlanta1;
        this.superficiePlanta2 = superficiePlanta2;
        this.precioVenta = precioVenta;
    }

    public int getSuperficiePlanta2() {
        return superficiePlanta2;
    }

    public void setSuperficiePlanta2(int superficiePlanta2) {
        this.superficiePlanta2 = superficiePlanta2;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiePlanta1() {
        return superficiePlanta1;
    }

    public void setSuperficiePlanta1(int superficiePlanta1) {
        this.superficiePlanta1 = superficiePlanta1;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
//    public int getSuperficieTotal(){
//        int total;
//        total=superficiePlanta1+superficiePlanta2;
//  
//        return calcularSuperficieTotal();
//    }
    
    public void imprimirDatos(){
              
        System.out.printf("%10s  %5d m2   %.0f€\n",
                            this.propietario,calcularSuperficieTotal(),this.precioVenta);
   
    }
    
    private int calcularSuperficieTotal(){
        return this.superficiePlanta1+this.superficiePlanta2;
    }
    
    
    
    
    
}
