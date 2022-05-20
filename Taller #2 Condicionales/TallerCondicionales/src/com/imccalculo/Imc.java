/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imccalculo;

import java.util.Scanner;

public class Imc {
    private static final double imcRange = 18.5;
    private static final double imcRange2 = 24.9;
    private static final double imcRange3 = 29.9;
    
    public static void main(String[] args) {
        System.out.println("Por favor digite su nombre completo");
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        
        System.out.println("Por favor digite su estatura en metros");
        double estatura =  input.nextDouble();
        
        System.out.println("Por favor sigite su peso en kilogramos");
        double peso = input.nextDouble();
        
        double imc = peso/(Math.pow(estatura, 2));
        
        if(imc<imcRange){
            System.out.println("Señor "+ nombre+ " usted tiene un imc de: "+imc+"por lo que se encuentra en el rango de bajo peso");
        }else if(imc>=imcRange && imc<=imcRange2){
            System.out.println("Señor "+ nombre+ " usted tiene un imc de: "+imc+"por lo que se encuentra en el rango de peso normal");
        }else if(imc>imcRange2 && imc<=imcRange3){
            System.out.println("Señor "+ nombre+ " usted tiene un imc de: "+imc+"por lo que se encuentra en el rango de sobrepeso");
        }else if(imc > imcRange3){
            System.out.println("Señor "+ nombre+ " usted tiene un imc de: "+imc+"por lo que se encuentra en el rango de obesidad");
        }
    }
}
