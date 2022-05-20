
package com.paresimpares;


public class ParImpar {
    public static void main(String[] args) {
        int i =0;
        int[] arr = new int[20];
        
        do{
            arr[i] = (int)(Math.random()*(100-1+1)+1);
            i++;
        }while(i != 20);
        
        System.out.print("Numeros Pares: ");
        for(int j =0 ;j<arr.length; j++){
            if(arr[j] % 2 == 0){
                System.out.print(arr[j] + ",");
            }
        }
        
        System.out.println();
        System.out.print("Numeros Imares: ");
        for(int j =0 ;j<arr.length; j++){
            if(!(arr[j] % 2 == 0)){
                System.out.print(arr[j] + ",");
            }
        }
        System.out.println();
    }
}
