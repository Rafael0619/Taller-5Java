
package com.capturadatospersona;

import java.util.Scanner;

public class CapturaDatosPersona {
     private static String nombre;
    private static String apellido;
    private static Integer edad;
    private static Double estatura;
    
    public CapturaDatosPersona() {
        
    }
    
    public static void capturaNombre(){
        Scanner input = new Scanner(System.in);
        nombre = input.nextLine();
    }
    
     public static void capturaApellido(){
        Scanner input = new Scanner(System.in);
        apellido = input.nextLine();
    }
     
       public static void capturaEdad(){
        Scanner input = new Scanner(System.in);
        edad = input.nextInt();
    }
       
       public static void capturaEstatura(){
        Scanner input = new Scanner(System.in);
        estatura = input.nextDouble();
    }

    public static void main(String[] args) {
        CapturaDatosPersona.capturaNombre();
        CapturaDatosPersona.capturaApellido();
        CapturaDatosPersona.capturaEdad();
        CapturaDatosPersona.capturaEstatura();
    }
}
