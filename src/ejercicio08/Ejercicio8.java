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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BD_Empresa mibd=new BD_Empresa();
        
        Empresa empresa=new Empresa("B12345678","Nike Inc.","Oregon(USA)");
        mibd.addEmpresa(empresa);
        
        empresa=new Empresa("B00044562","Apple Inc.","California(USA)");
        mibd.addEmpresa(empresa);
        
        mibd.addEmpresa(new Empresa("B11111111","Nitro SL","Murcia(SPA)"));
      
        //Busco la empresa con este CIF
        System.out.println("\nBuscando la empresa con CIF: B00044562");
        
        empresa=mibd.buscarCIF("B00044562");
        
        if (empresa!=null) 
            empresa.imprimir();
        else 
            System.out.println("La empresa no existe");
        
        //Busco la empresa con este CIF
        System.out.println("\nBuscando la empresa con CIF: B00000001");
        
        empresa=mibd.buscarCIF("B00000001");
        
        if (empresa!=null) 
            empresa.imprimir();
        else 
            System.out.println("La empresa no existe");
        
        
        
        //Probamos el método buscar por nombre
        String iniciales="ni";
        ArrayList<Empresa> resultados=mibd.buscarNombre(iniciales);
        
        System.out.println("\nBuscando empresas por..... "+iniciales);
        if (resultados.isEmpty())
            System.out.println("No hay empresas que comiencen por "+iniciales);
        else{
            System.out.println(resultados.size()+ "empresas encontradas:");
            System.out.println("--------------------------");
            for (int i = 0; i < resultados.size(); i++) {
                resultados.get(i).imprimir();
            }
            
//            for (Empresa e : resultados) {
//                    e.imprimir();
//               
//            }
        }
    }
}

