
package com.almacenamiento;

import java.util.ArrayList;


public class Almacenamiento {
    private ArrayList<Contacto> contactos;
    
 public Almacenamiento(){
     contactos = new ArrayList<Contacto>();
 }
 
 public boolean verificarContacto(String telefono){
     boolean verificacion = false;
     for(Contacto contacto : contactos){
         if(contacto.getTelefono().equals(telefono)){
             verificacion=true;
         }else{
             verificacion=false;
         }
     }
     return verificacion;
 }
 
 public void registrarContacto(Contacto contacto){
     boolean contactoVerificado= verificarContacto(contacto.getTelefono());
     if(contactoVerificado == false){
         contactos.add(contacto);
         System.out.println("Contacto guardado satisfactoriamente");
     }else{
         System.out.println("El contacto ya se encuentra registrado");
     }
 }
 
 public void buscarContacto(){
     System.out.println("Esta es la lista de los contactos alamcenados: ");
     int i = 0;
     for(Contacto contacto : contactos){
         i++;
         System.out.println("Contacto #"+i);
         System.out.println(contacto);
     }
 }
 
 public void eliminarContacto(String telefono){
     for(Contacto contacto: contactos){
         if(contacto.getTelefono().equals(telefono)){
             contactos.remove(contacto);
             System.out.println("Contacto eliminado exitosamente");
             return;
         }else{
             System.out.println("El contacto no se encuentra registrado");
         }
     }
 }
}
