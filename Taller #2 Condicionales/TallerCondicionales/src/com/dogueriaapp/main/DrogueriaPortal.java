
package com.dogueriaapp.main;

import com.dogueriaapp.DrogueriaMiSalud;
import java.util.Scanner;


public class DrogueriaPortal {
    
    public static void main(String[] args) {    
        System.out.println("************************************************************");
        System.out.println("            Bienvenidos a su drogueria MI SALUD");
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("Por favor seleccione la opción de la acción que quiere realizar: ");
        System.out.println("1. Comprar producto");
        System.out.println("2. Consultar precio de productos");
        System.out.println("3. Devoluciones");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba la  opcion");
        String opcion = input.nextLine();
        
        switch(opcion){
            case "1":
                System.out.println("Digite el nombre del producto");
                Scanner input2 = new Scanner(System.in);
                String producto = input2.nextLine();
                DrogueriaMiSalud.verificarDisponibilidad(producto);
                break;
            case "2":
                DrogueriaMiSalud.mostrarElementos();
                break;
            case "3":
                DrogueriaMiSalud.devolucionProducto();
                break;
            default:
                System.out.println("La opcion digitada es inválida");
          }
        
    }
}
