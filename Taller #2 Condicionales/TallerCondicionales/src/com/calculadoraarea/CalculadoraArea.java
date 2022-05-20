
package com.calculadoraarea;

import java.util.Scanner;


public class CalculadoraArea {
    private  static double base1;
    private static double base2;
    private static double altura;
    
    public static void main(String[] args) {
        System.out.println("Digite el numero de la opcion de la figura del cual quiere calcular el area:");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Trapecio");
        Scanner input = new Scanner(System.in);
        String opcion = input.nextLine();
        
        switch(opcion){
            case "1":
                System.out.println("Ingrese el valor de la base en cm");
                base1 = input.nextDouble();
                System.out.println("Ingrese el valor de la altura en cm");
                altura = input.nextDouble();
                System.out.println("La figura tiene: "+(base1*altura)/2 + " cm^2 de área");
                break;
            case "2":
                System.out.println("Ingrese el valor de la base en cm");
                base1=input.nextDouble();
                System.out.println("Ingrese el valor de la altura en cm");
                altura=input.nextDouble();
                System.out.println("La figura tiene: "+base1*altura + " cm^2 de área");
                break;
            case "3":
                System.out.println("Ingrese el valor de la base menor en cm");
                base1 = input.nextDouble();
                System.out.println("Ingrese el valor de la base mayor en cm");
                base2 = input.nextDouble();
                System.out.println("Ingrese el valor de la altura en cm");
                altura= input.nextDouble();
                System.out.println("La figura tiene: "+((base1+base2)*altura)/2+ " cm^2 de área");
                break;
            default:
                System.out.println("La opcion ingresada no existe");
        }
    }
}
