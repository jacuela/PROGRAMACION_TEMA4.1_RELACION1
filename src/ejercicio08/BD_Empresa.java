/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

import java.util.ArrayList;

/**
 *
 * @author juan.antonio
 */
public class BD_Empresa {
    
    private ArrayList<Empresa> bd;

    public BD_Empresa(){
        bd=new ArrayList<>();
    }
    
    public void addEmpresa(Empresa e){
        bd.add(e);
    }
    
    public Empresa buscarCIF(String cif){
        Empresa e;
        
        for (Empresa empresa : bd) {
            if (empresa.getCif().equals(cif)){
                return empresa;
            }
            
        }
       
        return null;
    }
    
    
    public ArrayList<Empresa> buscarNombre(String nombre){
        

        //Me creo el arraylist resultado vacio
        ArrayList<Empresa> lista=new ArrayList<>();
        
        for (Empresa empresa : bd) {
          if (empresa.getNombre().toLowerCase().startsWith(nombre.toLowerCase())){
                //La empresa actual coincide
                lista.add(empresa);   
          }
        }
        return lista;
    }
    
    public boolean exiteCIF(String cif){
        for (Empresa empresa : bd) {
            if (empresa.getCif().equalsIgnoreCase(cif)){
                return true;
            }
        }
        
        //Si llego aquí, es pq no he encontrado la empresa
        return false;
    }
    
    
    
    
}
