
package com.tallerimpresiones;

import java.util.Scanner;

public class CapturaNombreApellido {
    private static String nombre;
    private static String apellido;
    
    public CapturaNombreApellido() {
        
    }
    
    public static void capturaNombre(){
        Scanner input = new Scanner(System.in);
        nombre = input.nextLine();
    }
    
     public static void capturaApellido(){
        Scanner input = new Scanner(System.in);
        apellido = input.nextLine();
    }
    

    public static void main(String[] args) {
        CapturaNombreApellido.capturaNombre();
        CapturaNombreApellido.capturaApellido();
    }
   
}
