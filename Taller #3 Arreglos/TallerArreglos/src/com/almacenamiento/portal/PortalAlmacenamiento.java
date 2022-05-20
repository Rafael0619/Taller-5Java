
package com.almacenamiento.portal;

import com.almacenamiento.Almacenamiento;
import com.almacenamiento.Contacto;
import java.util.Scanner;


public class PortalAlmacenamiento {
    public static void main(String[] args) {
        int opcion = 0;
        String nombre;
        String organizacion;
        String telefono;
        Almacenamiento almacenamiento = new Almacenamiento();
        do{
            System.out.println("*************************************************");
            System.out.println("       Bienvenidos al portal de Contactos");
            System.out.println("*************************************************");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Buscar Lista de contactos almacenados");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir del sistema");
            System.out.println("");
            System.out.println("Por favor digite la opción de lo que quiere realizar: ");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Escriba el nombre completo del contacto");
                    nombre = input2.nextLine();
                    System.out.println("Escriba la organizacion del contacto");
                   organizacion = input2.nextLine();
                   System.out.println("Escriba el telefono del contacto");
                   telefono = input2.nextLine();
                    Contacto contacto = new Contacto(nombre, organizacion, telefono);
                    almacenamiento.registrarContacto(contacto);
                    break;
                case 2:
                    almacenamiento.buscarContacto();
                    break;
                case 3:
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("Escriba el telefono del contacto");
                    telefono = input4.nextLine();
                    almacenamiento.eliminarContacto(telefono);
                    break;
                case 4:
                    System.out.println("Ha finalizado la sesion correctamente");
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
        }while(opcion!=4);
    }
}
