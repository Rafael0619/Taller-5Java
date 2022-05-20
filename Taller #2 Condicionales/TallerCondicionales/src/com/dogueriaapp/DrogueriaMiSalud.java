
package com.dogueriaapp;

import java.util.ArrayList;
import java.util.Scanner;


public class DrogueriaMiSalud {
    public static String anotacion;
    public static int cantidad;
    public static final String producto1 = "dolex";
    public static final String producto2 = "mioflex";
    public static final String producto3 = "louten";
    public static final String producto4 = "prednisolona";
    public static final String producto5 = "vigamox";
    public static final int precioProducto1 = 500;
    public static final int precioProducto2 = 8000;
    public static final int precioProducto3 = 19950;
    public static final int precioProducto4 = 36700;
    public static final int precioProducto5 = 2500;


    
    

    public DrogueriaMiSalud() {
    }
    
    public static void verificarDisponibilidad(String producto){
        if(producto.equals(producto1) || producto.equals(producto2) || producto.equals(producto3) || producto.equals(producto4) || producto.equals(producto5)){
       if(producto.equals(producto1)){
           System.out.println("Cuantas unidades quiere comprar? ");
           Scanner input = new Scanner(System.in);
           cantidad = input.nextInt();
           System.out.println("Usted acaba de comprar "+ cantidad + " unidades de "+ producto +" para un valor a pagar de: "+ cantidad*precioProducto1);
       }else if(producto.equals(producto2)){
           System.out.println("Cuantas unidades quiere comprar? ");
           Scanner input = new Scanner(System.in);
           cantidad = input.nextInt();
           System.out.println("Usted acaba de comprar "+ cantidad + " unidades de "+ producto +" para un valor a pagar de: "+ cantidad*precioProducto2);
       }else if(producto.equals(producto3)){
           System.out.println("Cuantas unidades quiere comprar? ");
           Scanner input = new Scanner(System.in);
           cantidad = input.nextInt();
           System.out.println("Usted acaba de comprar "+ cantidad + " unidades de "+ producto +" para un valor a pagar de: "+ cantidad*precioProducto3);
       }else if(producto.equals(producto4)){
           System.out.println("Cuantas unidades quiere comprar? ");
           Scanner input = new Scanner(System.in);
           cantidad = input.nextInt();
           System.out.println("Usted acaba de comprar "+ cantidad + " unidades de "+ producto +" para un valor a pagar de: "+ cantidad*precioProducto4);
       }if(producto.equals(producto5)){
           System.out.println("Cuantas unidades quiere comprar? ");
           Scanner input = new Scanner(System.in);
           cantidad = input.nextInt();
           System.out.println("Usted acaba de comprar "+ cantidad + " unidades de "+ producto +" para un valor a pagar de: "+ cantidad*precioProducto5);
            }
          }else{
           System.out.println("El producto digitado no se encuentra en stock");
       }
    }
    
        public static void mostrarElementos() {
            System.out.println("Estos son los medicamentos en Stock y sus precios ");
            System.out.println("1. "+ producto1 + " ---------> " + precioProducto1 );
            System.out.println("2. "+ producto2 + " ---------> " + precioProducto2 );
            System.out.println("3. "+ producto3 + " ---------> " + precioProducto3 );
            System.out.println("4. "+ producto4 + " ---------> " + precioProducto4 );
            System.out.println("5. "+ producto5 + " ---------> " + precioProducto5 );     
    }
        
        public static void devolucionProducto(){
            System.out.println("Escriba las causales de devolucion del producto");
            Scanner input = new Scanner(System.in);
            anotacion = input.nextLine();
            System.out.println("Digite el numero del producto que quiere devolver");
            mostrarElementos();
            String opcion = input.nextLine();
            
            switch(opcion){
                case "1":
                    System.out.println("¿Cuántas unidades desea devolver?");
                    cantidad = input.nextInt();
                    System.out.println("Luego de la validación de la información se le devolverá el valor de : $"+cantidad*precioProducto1);
                    System.out.println("Las causales de devolución expresadas por usted son las siguientes: ");
                    System.out.println(anotacion);
                    break;
                case "2":
                    System.out.println("¿Cuántas unidades desea devolver?");
                    cantidad = input.nextInt();
                    System.out.println("Luego de la validación de la información se le devolverá el valor de : $"+cantidad*precioProducto2);
                    System.out.println("Las causales de devolución expresadas por usted son las siguientes: ");
                    System.out.println(anotacion);
                    break;
                case "3":
                   System.out.println("¿Cuántas unidades desea devolver?");
                    cantidad = input.nextInt();
                    System.out.println("Luego de la validación de la información se le devolverá el valor de : $"+cantidad*precioProducto3);
                    System.out.println("Las causales de devolución expresadas por usted son las siguientes: ");
                    System.out.println(anotacion);
                    break;
                case "4":
                    System.out.println("¿Cuántas unidades desea devolver?");
                    cantidad = input.nextInt();
                    System.out.println("Luego de la validación de la información se le devolverá el valor de : $"+cantidad*precioProducto4);
                    System.out.println("Las causales de devolución expresadas por usted son las siguientes: ");
                    System.out.println(anotacion);
                    break;
                case "5":
                    System.out.println("¿Cuántas unidades desea devolver?");
                    cantidad = input.nextInt();
                    System.out.println("Luego de la validación de la información se le devolverá el valor de : $"+cantidad*precioProducto5);
                    System.out.println("Las causales de devolución expresadas por usted son las siguientes: ");
                    System.out.println(anotacion);
                    break;
                default:
                    System.out.println("La opcion seleccionada no se encuentra en sistema");
            }
        }
}
