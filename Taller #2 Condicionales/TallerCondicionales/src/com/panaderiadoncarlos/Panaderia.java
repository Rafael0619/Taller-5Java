
package com.panaderiadoncarlos;

import java.util.Scanner;


public class Panaderia {
    private static final String torta1 = "torta de vainilla";
    private static final String torta2 = "torta de banano";
    private static final String torta3 = "torta de manzana";
    private static String sabor;
    private static int cantidad;
    private static String decoraciones;
    
    
    private static void mostrarTortas(){
        System.out.println("Estas son las tortas disponibles de momento:");
        System.out.println("1. "+torta1);
        System.out.println("2. "+torta2);
        System.out.println("3. "+torta3);
    }
    
    public static void main(String[] args) {
        System.out.println("________________________________________________________");
        System.out.println("      Bienvenido a la Panadería de Don Carlos");
        System.out.println("________________________________________________________");
        System.out.println("Por favor escoja la acción que quiere realizar:");
        System.out.println("1. Registro pedido");
        System.out.println("2. Verificar tortas disponibles");
        System.out.println("3. Registro de venta");
        
        Scanner input = new Scanner(System.in);
        String opcion = input.nextLine();
        
        switch(opcion){
            case "1":
                System.out.println("A continuacion se realizará el pedido de la torta segun sus especificaciones:");
                System.out.println("Por favor ingrese de que sabor le gustaría su torta");
                sabor = input.nextLine();
                System.out.println("Realice una breve descripción de como le gustaría que su torta se decore");
                decoraciones = input.nextLine();
                System.out.println("¿Cuántas porciones (cada porción pesa 250g) de la torta desea? ");
                cantidad = input.nextInt();
			
               System.out.println("Su pedido fue registrado exitosamente pronto nos estaremos comunicando con usted para realizar la entrega de la torta");
               System.out.println("A continuacion un resumen de su pedido");
               System.out.println("__________________________________________");
               System.out.println("sabor de la torta: --------> "+sabor);
               System.out.println("Cantidad de porciones: ----> "+ cantidad+ " ("+250*cantidad+ "g)");
               System.out.println("Decoración: "+ decoraciones);
                break;
            case "2":
                mostrarTortas();
                break;
                
            case "3":
                System.out.println("¿Qué torta desea comprar (escriba su nombre completo)?");
                Scanner input2 = new Scanner(System.in);
                String eleccion = input2.nextLine();
                if(eleccion.equals(torta1) || eleccion.equals(torta2) || eleccion.equals(torta3)){
                    System.out.println("Gracias por su compra");
                    System.out.println("Usted acaba de comprar la siguiente torta: "+ eleccion);
                }else{
                    System.out.println("Esa torta no esta disponible escoja en el menu principal la opcion 1 para tortas personificadas");
                }
                break;
            default:
                System.out.println("La opcion no existe");
    }
    }
}
