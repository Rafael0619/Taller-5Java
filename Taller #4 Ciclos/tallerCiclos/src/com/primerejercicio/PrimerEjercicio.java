
package com.primerejercicio;

import java.util.Scanner;


public class PrimerEjercicio {
    public static void main(String[] args) {
        int i =0;
        int[] arr = new int[5];
        while(i<=4){
            System.out.println("Digite un numero entero");
            Scanner input = new Scanner(System.in);
            int numero = input.nextInt();
            arr[i]=numero;
            i++;
        }
        for(int j = 0; j<arr.length;j++){
            System.out.println("["+j+"] = "+arr[j]);
        }
    }
}
