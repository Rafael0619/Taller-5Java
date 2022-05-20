
package com.escuelaelmaestro.test;

import com.escuelaelmaestro.Cliente;
import com.escuelaelmaestro.RegistroNotas;
import java.util.Scanner;


public class PortalAlumno {
    public static void main(String[] args) {
         int opcion = 0;
        String nombre;
        int edad;
        double nota;
        RegistroNotas registro = new RegistroNotas();
        do{
            System.out.println("*************************************************");
            System.out.println("       Bienvenidos al portal de Contactos");
            System.out.println("*************************************************");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Buscar Lista de alumnos");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Salir del sistema");
            System.out.println("");
            System.out.println("Por favor digite la opción de lo que quiere realizar: ");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Escriba el nombre completo del alumno");
                    nombre = input2.nextLine();
                    System.out.println("Escriba la edad del alumno");
                   edad = input2.nextInt();
                   System.out.println("Escriba la nota del alumno");
                   nota = input2.nextDouble();
                    Cliente cliente = new Cliente(nombre, edad, nota);
                    registro.registrarAlumno(cliente);
                    break;
                case 2:
                    registro.buscarAlumno();
                    break;
                case 3:
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("Escriba el nombre del contacto");
                    nombre = input4.nextLine();
                    registro.eliminarAlumno(nombre);
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

