/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmaquinista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class tallerMotos {
    public static void main(String[] args) {
        System.out.println("________________________________________________________");
        System.out.println("      Bienvenido a su tienda Motos El Maquinista");
        System.out.println("________________________________________________________");
        System.out.println("Por favor escoja la acción que quiere realizar:");
        System.out.println("1. Registro de entrada al taller de su moto");
        System.out.println("2. Registro de salida del taller");
        System.out.println("3. Historial de arreglos");

        Scanner input = new Scanner(System.in);
        String opcion = input.nextLine();
        
        switch(opcion){
            case "1":
                System.out.println("Por favor ingrese su nombre ");
                String nombre = input.nextLine();
                System.out.println("A continuacion se registrará la fecha de entrada del vehiculo");
                System.out.println("Por favor ingrese el día ");
                String dia = input.nextLine();
                System.out.println("Por favor ingrese el mes ");
                String mes = input.nextLine();
                System.out.println("Por favor ingrese el año ");
                String anio = input.nextLine();
                System.out.println("A continuacion por favor ingrese las notas pertinentes a la entrada del vehiculo");
                String anotacion = input.nextLine();
                Registro registro = new Registro(nombre,dia,mes,anio,anotacion);
                registro.mensajeSalida();
                break;
            case "2":
                Scanner input2 = new Scanner(System.in);
                System.out.println("Por favor ingrese su nombre ");
                String nombreSalida = input2.nextLine();
                System.out.println("A continuacion se registrará la fecha de entrada del vehiculo");
                System.out.println("Por favor ingrese el día ");
                String diaSalida = input2.nextLine();
                System.out.println("Por favor ingrese el mes ");
                String mesSalida = input.nextLine();
                System.out.println("Por favor ingrese el año ");
                String anioSalida = input.nextLine();
                System.out.println("A continuacion por favor ingrese las notas pertinentes a la entrada del vehiculo");
                String anotacionSalida = input.nextLine();
                Registro registroSalida = new Registro(nombreSalida,diaSalida,mesSalida,anioSalida,anotacionSalida);
                registroSalida.mensajeSalida();
               break;
               
            case "3":
                Registro registroDos = new Registro();
                registroDos.mostrarRespuestos();
        }
    }
}
