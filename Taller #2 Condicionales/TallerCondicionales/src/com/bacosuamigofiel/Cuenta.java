
package com.bacosuamigofiel;

import java.util.Scanner;


public class Cuenta {
    private static String titular;
    private static int cantidad;
    private static final String titular1 = "Rafael Munoz";
    private static final int cantidad1 = 12000;
     private static final String titular2 = "Maria Zuluaga";
    private static final int cantidad2 = 2598;
     private static final String titular3 = "Daniela Castilla";
    private static final int cantidad3 = 32007;
    
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("           Bienvenidos a su Banco Fiel");
        System.out.println("*************************************************************");
        System.out.println("Por favor seleccione la opción de la acción que quiere realizar: ");
        System.out.println("1. Ingresos");
        System.out.println("2. Retiros");
        System.out.println("3. Consultas");
        Scanner input = new Scanner(System.in);
        String opcion = input.nextLine();
        
        switch(opcion){
            case "1":
                System.out.println("Digite su primer nombre y su primer apellido");
                titular = input.nextLine();
                
                if(titular.equals(titular1)){
                    System.out.println("Si pertenece a su banco fiel y tiene en su cuenta bancaria una cantidad de dinero de: $: " + cantidad1);
                    System.out.println("Digite la cantidad de dinero a ingresar ");
                    cantidad = input.nextInt();
                    if(cantidad >=0){
                        System.out.println("Ahora su saldo actualizado es de: $ "+ (cantidad1+cantidad));
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }else{
                        System.out.println("La cantidad es negativa por lo tanto no se puede realisar la transacción");
                      }
                    }else if(titular.equals(titular2) ){
                    System.out.println("Si pertenece a su banco fiel y tiene en su cuenta bancaria una cantidad de dinero de: $: " + cantidad2);
                    System.out.println("Digite la cantidad de dinero a ingresar ");
                    cantidad = input.nextInt();
                    if(cantidad >=0){
                        System.out.println("Ahora su saldo actualizado es de: $ "+ (cantidad2+cantidad));
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }else{
                        System.out.println("La cantidad es negativa por lo tanto no se puede realisar la transacción");
                    }
                    }else if(titular.equals(titular3)){
                    System.out.println("Si pertenece a su banco fiel y tiene en su cuenta bancaria una cantidad de dinero de: $: " + cantidad3);
                    System.out.println("Digite la cantidad de dinero a ingresar ");
                    cantidad = input.nextInt();
                    if(cantidad >=0){
                        System.out.println("Ahora su saldo actualizado es de: $ "+ (cantidad3+cantidad));
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }else{
                        System.out.println("La cantidad es negativa por lo tanto no se puede realisar la transacción");
                    }
                    }
                    else{
                            System.out.println("El usuario no se encuentra registrado en nuestro banco");
                   }
                    break;
            case "2":
                System.out.println("Digite su primer nombre y su primer apellido para validar que pertenece a su banco fiel");
                titular = input.nextLine();
                
                if(titular.equals(titular1)){
                    System.out.println("Si pertenece a su banco fiel y tiene en su cuenta bancaria una cantidad de dinero de: $: " + cantidad1);
                    System.out.println("Digite la cantidad de dinero a retirar ");
                    cantidad = input.nextInt();
                    if(cantidad <= cantidad1){
                        System.out.println("Retiro por valor de "+ cantidad+ " fue exitosos");
                        System.out.println("Ahora su saldo actualizado es de: $ "+ (cantidad1 - cantidad));
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }else{
                        System.out.println("El numero ingresado es mayor a la cantidad disponible");
                      }
                    }else if(titular.equals(titular2) ){
                    System.out.println("Si pertenece a su banco fiel y tiene en su cuenta bancaria una cantidad de dinero de: $: " + cantidad2);
                    System.out.println("Digite la cantidad de dinero a retirar ");
                    cantidad = input.nextInt();
                    if(cantidad <= cantidad2){
                        System.out.println("Retiro por valor de "+ cantidad+ " fue exitosos");
                        System.out.println("Ahora su saldo actualizado es de: $ "+ (cantidad2-cantidad));
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }else{
                        System.out.println("El numero ingresado es mayor a la cantidad disponible");
                    }
                    }else if(titular.equals(titular3)){
                    System.out.println("Si pertenece a su banco fiel y tiene en su cuenta bancaria una cantidad de dinero de: $: " + cantidad3);
                    System.out.println("Digite la cantidad de dinero a retirar ");
                    cantidad = input.nextInt();
                    if(cantidad <= cantidad3){
                        System.out.println("Retiro por valor de "+ cantidad+ " fue exitosos");
                        System.out.println("Ahora su saldo actualizado es de: $ "+ (cantidad3-cantidad));
                        System.out.println("Gracias por utilizar nuestros servicios");
                    }else{
                        System.out.println("El numero ingresado es mayor a la cantidad disponible");
                    }
                    }
                    else{
                            System.out.println("El usuario no se encuentra registrado en nuestro banco");
                   }
                    break;
            case "3":
                System.out.println("Esta es la lista de los titulares de cuentas en nuestro banco: ");
                System.out.println("1. "+ titular1);
                System.out.println("2. "+titular2);
                System.out.println("3. "+titular3);
                break;
            default:
                System.out.println("La opcion seleccionada no existe");
          }
        }
}
    
  
