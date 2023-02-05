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
        
        //Lo hago a lo fácil
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
    
    //=============================================================
    
    public static String generarCodigoLibro(){
        String codigo="";
        //Genero aleatoriamente un codigo en formato
        //LLDDD siendo L una letra y D un dígito
        char letra1,letra2;
        int digito1,digito2,digito3;
        
        //Genero letra de a A..Z y los digitos 0..9
        letra1=(char)((int)(Math.random()*26+65));
        letra2=(char)((int)(Math.random()*26+65));
        digito1=(int)(Math.random()*10);
        digito2=(int)(Math.random()*10);
        digito3=(int)(Math.random()*10);
        
        //Me creo una cadena
        StringBuilder sb=new StringBuilder();
        sb.append(letra1);
        sb.append(letra2);
        sb.append(digito1);
        sb.append(digito2);
        sb.append(digito3);
        
        //Generamos la cadena y la guardamos
        codigo=sb.toString();
        
        return codigo;
        
    }
    
    
    //=============================================================

    
    
    
}
