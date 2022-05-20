
package com.arbolitnavidad;

public class ArbolitoNavidad {
    public static void main(String[] args) {
        int iteraciones = 10;
        
        do{
            int variante  = iteraciones;
            
            if(!(variante == 0)){
                do{
                    System.out.print(" ");
                    variante--;
                }while(variante>=1);
            }
            
            int hojas = 10-iteraciones;
            if(!(hojas ==0)){
                do{
                    System.out.print("*");
                    hojas--;
                }while(hojas>=1);
            }
            
            System.out.print("*");
            variante = iteraciones;
            hojas = 10 - iteraciones;
            
            if(!(hojas ==0)){
                do{
                    System.out.print("*");
                    hojas--;
                }while(hojas>=1);
            }
            
            if(!(variante == 0)){
                do{
                    System.out.print(" ");
                    variante--;
                }while(variante>=1);
            }
            
            System.out.println();
            iteraciones--;
        }while(iteraciones>=0);
        
        iteraciones = 4;
        do{
            int variante = iteraciones +7;
            if(variante != 11){
                do{
                    System.out.print(" ");
                    variante--;
                }while(variante>1);
            }else{
                do{
                    System.out.print(" ");
                    variante--;
                }while(variante>2);
            }
            
            int hojas = 4 - iteraciones;
            
            if(hojas!=0){
                do{
                    System.out.print("*");
                    hojas--;
                }while(hojas>=1);
            }else{
                System.out.print("*");
            }
            
            System.out.print("*");
            
           hojas = 4 - iteraciones;
            
            if(hojas!=0){
                do{
                    System.out.print("*");
                    hojas--;
                }while(hojas>=1);
            }else{
                System.out.print("*");
            }
            
            System.out.println("");
            iteraciones--;
            
        }while(iteraciones >=1);
    }
}
