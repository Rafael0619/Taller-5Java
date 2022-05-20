
package com.primos;


public class Primos {
    public static void main(String[] args) {
        for(int i = 1 ; i<=1000 ; i++){
            int j = 1;
            int divisiones = 0;
            while(j<=i){
                if(i % j ==0){
                    divisiones++;
                }
                j++;
            }
            if(divisiones ==2){
                System.out.print(i+",");
            }
        }
    }
}
