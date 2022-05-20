
package com.fiestaapp.main;

import com.fiestaapp.Persona;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor digite sus nombres ");
        String nombres = input.nextLine();
        System.out.println("Por favor digite sus apellidos ");
        String apellidos= input.nextLine();
        System.out.println("Por favor digite su edad");
        int edad = input.nextInt();
        
        Persona persona = new Persona(nombres,apellidos,edad);
        
        persona.validarEntrada();
        
        }
}
