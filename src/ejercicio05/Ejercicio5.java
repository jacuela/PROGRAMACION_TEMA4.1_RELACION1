/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio5 {
      //static Scanner teclado=new Scanner(System.in);
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Casa []listaCasas=new Casa[50];
        int totalCasas=0;
        int opcion = 0;

        //Metemos 3 casas desde codigo
        listaCasas[totalCasas]=new Casa("Juan",30,45,120000);
        totalCasas++;
        
        listaCasas[totalCasas]=new Casa("Pedro",120,0,100000);
        totalCasas++;
        
        listaCasas[totalCasas]=new Casa("Alicia",70,70,150000);
        totalCasas++;
        
        
        
        do {
            System.out.println("\n\n\n===================");
            System.out.printf("    MENU CASAS         \n");
            System.out.println("===================");
            
            System.out.println("1. Añadir casa");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propieatio");
            System.out.println("4. Buscar (precio)");
            System.out.println("5. Salir");
           
            System.out.print("\nElige opcion:");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                        System.out.println("====  Alta de nueva casa ====");
                        System.out.print("Nuevo propietario:");
                        String propietario=teclado.nextLine();
                        System.out.print("Superficie PLANTA1:");
                        int p1=Integer.parseInt(teclado.nextLine());
                        System.out.print("Superficie PLANTA2:");
                        int p2=Integer.parseInt(teclado.nextLine());
                        System.out.print("Precio de Venta:");
                        double precio=Double.parseDouble(teclado.nextLine());

                        listaCasas[totalCasas]=new Casa(propietario,p1,p2,precio);
                        totalCasas++;
                        break;
                case 2:
                        System.out.println("====  Litado de casas ====");
                        for (int i = 0; i < totalCasas ; i++) {
                                System.out.print("CASA "+(i+1)+"-->");
                                listaCasas[i].imprimirDatos();
                        }
                       break;
                case 3:
                        System.out.println("====  Cambiar propietario ====");
                        //Listo las casas
                        for (int i = 0; i < totalCasas ; i++) {
                            System.out.print("CASA "+(i+1)+"-->");
                            listaCasas[i].imprimirDatos();
                        }
                        System.out.print("Numero de casa a modificar:");
                        int numCasa=Integer.parseInt(teclado.nextLine());
                        System.out.print("Nuevo propietario:");
                        String nuevoPropietario=teclado.nextLine();
                        listaCasas[numCasa-1].setPropietario(nuevoPropietario);
                    
                        break;
                case 4:
                        System.out.println("\n====  Buscar casas por precio ====");
                        System.out.print("¿Cual es el precio máximo?");
                        int precioMax=Integer.parseInt(teclado.nextLine());
                        buscarCasas(listaCasas,totalCasas,precioMax);
                        break;
                case 5:
                        break;
                default:
                        System.out.println("Opción no valida");
                    
            }
            
        } while (opcion != 5);
        System.out.println("-----------------");
        System.out.println("PROGRAMA CERRADO.");
     
        
    }

    
    private static void buscarCasas(Casa[] listaCasas, int totalCasas, int precioMax) {
        //Scanner teclado=new Scanner(System.in);
        boolean hayCasas=false;
        
        for (int i = 0; i < totalCasas ; i++) {
            
            if (listaCasas[i].getPrecioVenta()<=precioMax){
               System.out.print("CASA "+(i+1)+"-->");
               listaCasas[i].imprimirDatos();
               hayCasas = true;
            }
        }
        
        if (!hayCasas){
            System.out.println("No hay casas por debajo de dicho precio");
        }
        
    
    }
    
    
}
