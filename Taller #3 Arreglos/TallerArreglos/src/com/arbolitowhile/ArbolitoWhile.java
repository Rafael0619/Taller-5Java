
package com.arbolitowhile;


public class ArbolitoWhile {
    public static void main(String[] args) {
        int control = 10;
        String asterisco = "*";
        
        while(control>0){
            int segundoControl = control-1;
            while(segundoControl >0){
                System.out.print(" ");
                segundoControl--;
            }
            int variante = 1;
            while(variante <= (10-(control-1))){
                System.out.print(asterisco);
                variante++;
            }
            System.out.println();
            control--;
        }
    }
}
