
package com.menuinfinito;

import java.util.Scanner;


public class MenuInfinito {
    
    public static void main(String[] args) {
        int opcion;
        String nombre;
        nombre="Aun no hemos capturado tu nombre";
        do{
            System.out.println("Menú de usuario");
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            System.out.println("Digite la opcion que desea");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            if(opcion == 1){
                System.out.println();
                Scanner input2 = new Scanner(System.in);
                System.out.println("Escriba su nombre");
                nombre=input2.nextLine();
            }else if(opcion ==2){
                System.out.println();
                System.out.println("Hola, "+nombre);
                System.out.println();
            }else if(opcion ==3){
                System.out.println();
                System.out.println("Acabar de salir del sistema, Muchas Gracias.");
            }
    }while(opcion != 3);
    }
}
