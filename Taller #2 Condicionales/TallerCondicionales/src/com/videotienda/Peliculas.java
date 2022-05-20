
package com.videotienda;

public class Peliculas {
    private static String nombre;
    private static String anotacion;
    private static final String peliculaUno  = "La isla siniestra";
    private static final String peliculaDos  = "Contratiempo";
    private static final String peliculaTres  = "El Origen";
    
    public Peliculas(String nombre){
        this.nombre= nombre;
    }
    
    public static void alquilarPelicula(String nombrePersona){
        verificarDisponibilidad(nombrePersona);
    }
    
    public static void verificarDisponibilidad(String nombrePersona){
        if(nombre.equals(peliculaUno) || nombre.equals(peliculaDos) || nombre.equals(peliculaTres)){
            System.out.print("Muchas Gracias señor, "+nombrePersona+" por haber realizado la compra,");
            System.out.println(" usted acaba de alquilar la pelicula: " + nombre);
        }else{
            System.out.print("Señor, "+nombrePersona+" lamentablemente no contamos con la pelicula, ");
            System.out.println(nombre + ", en stock en estos momentos. Gracias");
        }
    }
    
    public static void obtenerPeliculas(){
        System.out.println("Estas son las peliculas disponibles de momento: ");
        System.out.println("1. " + peliculaUno);
        System.out.println("2. " + peliculaDos);
        System.out.println("3. " + peliculaTres);
    }

    public static void setAnotacion(String anotacion) {
        Peliculas.anotacion = anotacion;
    }

    public static String getAnotacion() {
        return anotacion;
    }
    
}
