
package com.fiestaapp;


public class Persona {
    private static String nombres;
    private static String apellidos;
    private static int edad;
    
    public Persona(String nombres,String apellidos , int edad){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.edad =edad;
    }
    
    public static String nombreCompleto(){
        String nombreCom = nombres + " " + apellidos;
        return nombreCom;
    }
    
    public static void validarEntrada(){
        if(edad >= 18){
            System.out.println(nombreCompleto() + " Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else {
            System.out.println(nombreCompleto() + " Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuelvase a su casa");
        }
    }
    
}
