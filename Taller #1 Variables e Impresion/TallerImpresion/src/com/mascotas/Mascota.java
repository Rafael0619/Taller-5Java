
package com.mascotas;


public class Mascota {
    private static String nombre;
    private static int edad;
    private static String tipo;

    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo =tipo;
    }

    public static String getNombre() {
        return nombre;
    }

    public static int getEdad() {
        return edad;
    }

    public static String getTipo() {
        return tipo;
    }

   
    
    
}
