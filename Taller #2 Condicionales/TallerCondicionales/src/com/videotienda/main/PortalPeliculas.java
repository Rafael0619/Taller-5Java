
package com.videotienda.main;

import com.videotienda.Peliculas;
import java.util.Scanner;


public class PortalPeliculas {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre completo: ");
        String nombre = input.nextLine();
        
        System.out.println("             Bienvenido a la videoteca del barrio Porvenir");
        System.out.println("__________________________________________________________________________________");
        System.out.println( "Escoja una de las siguientes opciones para la accion que desee realizar:"); 
        System.out.println("");
        System.out.println("1. Alquilar Pelicula");
        System.out.println("2. Consultar Peliculas Disponibles");
        System.out.println("3. Recibir pelicula en la videotienda");
        String opcion = input.nextLine();
        
        
        
        switch(opcion){
            case "1":
                Scanner inputPeli = new Scanner(System.in);
                System.out.println("Escriba el nombre de la pelicula");
                String nombrePeli = inputPeli.nextLine();
                Peliculas pelicula = new Peliculas(nombrePeli);
                pelicula.alquilarPelicula(nombre);
                break;
            case "2":
                Peliculas.obtenerPeliculas();
                break;
            case "3":
                System.out.println("Seleccione la accion que desea realizar");
                System.out.println("1. Recibir en la tienda");
                System.out.println("2. Recibir en tienda y realizar una anotacion");
                String opcionDos = input.nextLine();
                
                switch (opcionDos) {
                    case "1":
                        System.out.println("Puede dirigirse a la direccion Carrera 84 # 46- 108, para recoger su pelicula");
                        System.out.println("Gracias por su compra");
                        break;
                    case "2":
                        System.out.println("Puede dirigirse a la direccion Carrera 84 # 46- 108, para recoger su pelicula");
                        System.out.println("");
                        System.out.println("Por favor escriba su anotación");
                        String anotacion = input.nextLine();
                        Peliculas.setAnotacion(anotacion);
                        
                        System.out.println("Señor "+ nombre + " su anotacion fue la siguiente: ");
                        System.out.println(Peliculas.getAnotacion());
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
        
    }
    
}
