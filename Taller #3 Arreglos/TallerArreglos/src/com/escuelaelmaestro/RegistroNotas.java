
package com.escuelaelmaestro;

import java.util.ArrayList;


public class RegistroNotas {
    private ArrayList<Cliente> clientes;
    
 public RegistroNotas(){
     clientes = new ArrayList<Cliente>();
 }
 
 public boolean verificarAlumno(String nombre){
     boolean verificacion = false;
     for(Cliente cliente : clientes){
         if(cliente.getNombre().equals(nombre)){
             verificacion=true;
         }else{
             verificacion=false;
         }
     }
     return verificacion;
 }
 
 public void registrarAlumno(Cliente cliente){
         boolean alumnoVerificado= verificarAlumno(cliente.getNombre());
     if(alumnoVerificado == false){
         if(cliente.getNota() >0 && cliente.getNota() <80){
            cliente.setAprobacion("No Aprobado");
          }else if(cliente.getNota() >=80 && cliente.getNota()<=100){
            cliente.setAprobacion("Aprobado");
           }else{
                System.out.println("Nota inválida");
                return;
            }
         clientes.add(cliente);
         System.out.println("Contacto guardado satisfactoriamente");
     }else{
         System.out.println("El contacto ya se encuentra registrado");
     }
 }
 
 public void buscarAlumno(){
     if(clientes.isEmpty()){
         System.out.println("No hay alumnos registrados"); 
     }else{
     System.out.println("Esta es la lista de los alumnos: ");
     int i = 0;
     for(Cliente cliente : clientes){
         i++;
         System.out.println("Alumno #"+i);
         System.out.println(cliente);
     }
    }
 }
 
 public void eliminarAlumno(String nombre){
     int verificador=0;
     if(!clientes.isEmpty()){

         for(int i = 0; i<clientes.size(); i++){
                if(clientes.get(i).getNombre().equals(nombre)){
                    clientes.remove(i);
                    verificador++;
                }
          }
     if(verificador == 1){
          System.out.println("Alumno eliminado correctamente");
     }else{
          System.out.println("El alumno no s eencuentra en la base de datos ");
     }
     }else{
         System.out.println("No hay registro de ningun alumno");
     }
     
 }
 }
