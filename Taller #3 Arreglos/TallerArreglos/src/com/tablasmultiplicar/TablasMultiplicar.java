
package com.tablasmultiplicar;

import java.util.Scanner;


public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor digite el numero de la tabla de multiplicar que quiere crear");
        int tabla = input.nextInt();
        
        for(int i = 1; i <=10; i++ ){
            System.out.println(i+" x "+tabla+" = "+i*tabla);
        }
    }
}
