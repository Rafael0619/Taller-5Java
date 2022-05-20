
package com.parqueaderoelguardian;

import java.util.ArrayList;


public class Registro {
    private ArrayList<Vehiculo> registros;
    
    public Registro(){
        registros = new ArrayList<Vehiculo>(5);
    }
    
     public boolean verificarVehiculo(String placa){
     boolean verificacion = false;
     for(Vehiculo vehiculo : registros){
         if(vehiculo.getPlaca().equals(placa)){
             verificacion=true;
         }else{
             verificacion=false;
         }
     }
     return verificacion;
 }
 
 public void registrarVehiculo(Vehiculo vehiculo){
     if(registros.size() <5){
         boolean vehiculoVerificado= verificarVehiculo(vehiculo.getPlaca());
          if(vehiculoVerificado == false){
                registros.add(vehiculo);
                System.out.println("Vehiculo guardado satisfactoriamente");
          }else{
                System.out.println("El vehiculo ya se encuentra guardado en el parqueadero");
           }
          }else{
         System.out.println("El parqueadero esta completamente ocupado");
     }
     
 }
 
 public void mostrarVehiculos(){
     if(!registros.isEmpty()){
          System.out.println("Esta es la lista de los contactos alamcenados: ");
     int i = 0;
     for(Vehiculo vehiculo : registros){
         i++;
         System.out.println("Puesto #"+i);
         System.out.println(vehiculo);
         System.out.println("_____________________________");
     }
     }else{
             System.out.println("El parqueadero está vacio");
             }
    
 }
 
 public void salidaVehiculo(String placa){
     int verificador=0;
     if(!registros.isEmpty()){
//         for(Vehiculo vehiculo: registros){
//         if(vehiculo.getPlaca().equals(placa)){
//             registros.remove(vehiculo);
//             verificador = 1;
//         }
//     }
            for(int i = 0; i<registros.size();i++){
                if(registros.get(i).getPlaca().equals(placa)){
                    registros.remove(i);
                    verificador = 1;
                }
            }
     if(verificador == 1){
          System.out.println("Vehiculo ha salido exitosamente");
     }else{
          System.out.println("El vehiculo no se encuentra parqueado");
     }
     }else{
         System.out.println("El parqueadero se encuentra vacio");
     }
     
 }
}
