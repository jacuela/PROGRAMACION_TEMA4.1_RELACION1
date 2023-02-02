/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author juan.antonio
 */
public class Empresa {
    private String cif;
    private String nombre;
    private String localidad;

    public Empresa(String cif, String nombre, String localidad) {
        this.cif = cif;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void imprimir(){
        System.out.printf("\033[31m %s \033[34m- %-15s - %s\033[30m\n",cif,nombre,localidad);
    }
   
    
    
    
}
