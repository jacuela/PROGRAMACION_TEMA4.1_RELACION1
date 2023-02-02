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
        
        for (int i = 0; i < bd.size(); i++) {
            e=bd.get(i);
            //e es la empresa actual, apuntada por i
            if (e.getCif().equals(cif))
                return e;
        }
        return null;
    }
    
    
    
    public ArrayList<Empresa> buscarNombre(String nombre){
        

        //Me creo el arraylist resultado vacio
        ArrayList<Empresa> lista=new ArrayList<>();
        Empresa e;
        String nombreEmpresaMinu;
        
        for (int i = 0; i < bd.size(); i++) {
            //Obtengo la empresa apuntada por i
            e=bd.get(i);
            nombreEmpresaMinu=e.getNombre().toLowerCase();
            //Compruebo si el nombre escrito coincide con el
            //principio del nombre de la empresa
            if (nombreEmpresaMinu.startsWith(nombre.toLowerCase()))
                //La empresa actual coincide
                lista.add(e);
        }
        return lista;
    }
    
    
    
}
