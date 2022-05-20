
package com.padresehijos.main;

import java.util.Scanner;
import com.padresehijos.Hijo;
import com.padresehijos.Madre;
import com.padresehijos.Padre;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba sus nombres");
        String nombres = input.nextLine();
        System.out.println("Escriba sus apellidos");
        String apellidos = input.nextLine();
        Hijo hijo = new Hijo(nombres, apellidos);
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Escriba el nombre del padre");
        String nombrePadre = input2.nextLine();
        System.out.println("Escriba el apellido del padre");
        String apellidoPadre = input2.nextLine();
        Padre padre = new Padre(nombrePadre, apellidoPadre);
        
        Scanner input3 = new Scanner(System.in);
        System.out.println("Escriba el nombre de la madre");
        String nombreMadre = input3.nextLine();
        System.out.println("Escriba el apellido de la madre");
        String apellidoMadre = input3.nextLine();
        Madre madre = new Madre(nombreMadre, apellidoMadre);
        
        System.out.println("Yo "+ hijo.nombreCompleto() + ", soy hijo de "+ madre.nombreCompleto() + " y " + padre.nombreCompleto() );
    }
}
