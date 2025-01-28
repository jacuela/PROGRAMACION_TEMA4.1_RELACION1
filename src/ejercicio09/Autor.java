/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

/**
 *
 * @author juan.antonio
 */
public class Autor {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;

    public Autor(String nombre, String apellido1,
            String apellido2,String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email=email;
    }
    
    public String getApellido1() {
        return apellido1;
    }
    
    public String getNombreCita(){
        
        
        char inicial1;
        char inicial2;
        int posicionEspacio=-1;
        String cita="";
        
        //Saber si es nombre simple o compuesto
        //Obtengo posicion del espacio en blanco
        // -1 si no existe
        //OPCION larga
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i)==' ')
                posicionEspacio=i;
        }
        
        //OPCION ¡corta
        posicionEspacio=nombre.indexOf(' ');
        
        
        if (posicionEspacio!=-1){
            //Es nombre compuesto
            inicial1=nombre.charAt(0);
            inicial2=nombre.charAt(posicionEspacio+1);
            cita=String.format("%s, %c.%c.",this.apellido1,
                                            inicial1,
                                            inicial2);
        }
        else{
            //Es nombre simple
            inicial1=nombre.charAt(0);
            cita=String.format("%s, %c.",this.apellido1,
                                            inicial1);
        }
        
        return cita;
        
                
//       StringBuilder sb=new StringBuilder();
//       sb.append(this.apellido1);
//       sb.append(", ");
//       sb.append(this.nombre.charAt(0));
//       sb.append(".");
//       if (posicionEspacio!=-1){
//            sb.append(nombre.charAt(posicionEspacio+1));
//            sb.append(". ");
//       }
//       return sb.toString();
        
    }
    
    
    
    
    
}
