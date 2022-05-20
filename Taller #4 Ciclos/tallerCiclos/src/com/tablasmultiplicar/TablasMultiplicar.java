
package com.tablasmultiplicar;

import java.util.Scanner;


public class TablasMultiplicar {
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];
        System.out.println("                    ___________________________________________________________________________________________________________________________________________" );
        System.out.println("                    |                                                              COLUMNAS                                                                     |");
        System.out.println("                    -------------------------------------------------------------------------------------------------------------------------------------------" );
        System.out.print("                    ");
        for(int i=0; i<=9;i++){
            System.out.print("|     "+ i+ "      ");
        }
        System.out.println("|");
        System.out.println("                    -------------------------------------------------------------------------------------------------------------------------------------------" );
    for(int i =0; i<=9;i++){
         if(i == 9){
            System.out.print("              "+i+ " --->     ");
            for(int j = 0 ;j<=9;j++ ){
                System.out.print( (j+1)+ " x "+ (i+1)+ "       ");
                tabla[i][j]= (j+1)*(i+1);
            }
        }else if(i == 4){
             System.out.print("FILAS ---->   ");
             System.out.print( i+ " --->     ");
             for(int j = 0; j <=9 ; j++){
                  System.out.print( (j+1)+ " x "+( i+1)+ "        ");
                tabla[i][j]= (j+1)*(i+1);
             }
         }else{
             System.out.print("              "+i+ " --->     ");
             for(int j = 0; j <=9 ; j++){
                  System.out.print(( j+1)+ " x "+( i+1)+ "        ");
                tabla[i][j]= (j+1)*(i+1);
             }
         } 
         System.out.println();
    }
    
        System.out.println("");
        System.out.println("");
        System.out.println("Escriba el numero de la fila ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
       System.out.println("Escriba el numero de la columna");
       int j = input.nextInt();
        System.out.print("El resultado es: ");
        System.out.println(tabla[i][j]);
    }
}
