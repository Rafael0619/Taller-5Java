
package com.capitalpais;

import java.util.Scanner;


public class CapitalPais {
        private static String capital;
        private static String pais;
    
    public static void main(String[] args) {
        
        System.out.println("Escriba el nombre de una ciudad capital");
        Scanner input = new Scanner(System.in);
        capital = input.nextLine();
        System.out.println("Escriba el nombre del pais");
        pais = input.nextLine();
        
        System.out.println("La ciudad "+ capital + ", es la capital del país "+ pais);
       
    }
}
