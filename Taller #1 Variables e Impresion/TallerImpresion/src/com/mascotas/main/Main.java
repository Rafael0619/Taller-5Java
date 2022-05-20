
package com.mascotas.main;

import com.mascotas.Dueño;
import com.mascotas.Mascota;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su mascota");
        String nomMasc = input.nextLine();
         System.out.println("Ingrese que tipo de mascota es");
        String tipo = input.nextLine();
        System.out.println("Ingrese la edad de su mascota");
        int edadMasc = input.nextInt();
        Mascota mascota = new Mascota(nomMasc, edadMasc, tipo);
        
        Scanner inputDos = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo");
        String nombre = inputDos.nextLine();
        Dueño dueño = new Dueño(nombre);
        
        System.out.print(mascota.getNombre() + " es un(a) "+ mascota.getTipo()+ ", el cual, tiene "+ mascota.getEdad());
        System.out.println(" años de edad y "+ dueño.getNombre() + " es actualmente su dueño");
    }
}
