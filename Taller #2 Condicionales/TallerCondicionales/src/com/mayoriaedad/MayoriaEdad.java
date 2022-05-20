/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayoriaedad;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class MayoriaEdad {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad");
        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        
        if(edad >= 18){
            System.out.println("Usted es mayor de edad");
        }
    }
}
