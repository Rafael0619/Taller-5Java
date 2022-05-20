
package com.minoriaedad;

import java.util.Scanner;


public class MinoriaEdad {
    public static void main(String[] args) {
         System.out.println("Ingrese su edad");
        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        
        if(edad < 18){
            System.out.println("Usted es aún es un(a) niño(a)");
        }
    }
}
