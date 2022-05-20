
package com.parqueaderoelguardian.portalregistros;

import com.parqueaderoelguardian.Registro;
import com.parqueaderoelguardian.Vehiculo;
import java.util.Scanner;


public class PortalRegistros {
      public static void main(String[] args) {
        int opcion = 0;
        String placa;
        String marca;
        String nombre;
        String telefono;
        Registro registro = new Registro();
        do{
            System.out.println("*************************************************");
            System.out.println("       Bienvenidos al portal de Contactos");
            System.out.println("*************************************************");
            System.out.println("1. Registrar entrada de vehiculo al parqueadero");
            System.out.println("2. Lista de vehiculos parqueados");
            System.out.println("3. Salida de vehiculo");
            System.out.println("4. Salir del sistema");
            System.out.println("");
            System.out.println("Por favor digite la opción de lo que quiere realizar: ");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Escriba la placa del vehiculo");
                    placa = input2.nextLine();
                    System.out.println("Escriba la marca del vehiculo");
                   marca = input2.nextLine();
                   System.out.println("Escriba el nombre del propietario");
                   nombre = input2.nextLine();
                   System.out.println("Escriba el numero telefonico del propietario");
                   telefono = input2.nextLine();
                   Vehiculo vehiculo = new Vehiculo(placa, marca, nombre, telefono);
                    registro.registrarVehiculo(vehiculo);
                    break;
                case 2:
                    registro.mostrarVehiculos();
                    break;
                case 3:
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("Escriba la placa del vehiculo");
                    placa = input4.nextLine();
                    registro.salidaVehiculo(placa);
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
