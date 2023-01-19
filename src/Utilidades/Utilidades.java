/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author juan.antonio
 */
public class Utilidades {
    
    public static boolean checkEmail(String email){
        
        //Lo hago sencillamente. Habria que programarlo bien
        if (    email.contains("@") && 
                email.contains(".") &&
               (email.indexOf("@")<email.indexOf("."))
           ){
            return true;
        }
        else{
            return false;
        
        }
        
    }
    
    
    
}
