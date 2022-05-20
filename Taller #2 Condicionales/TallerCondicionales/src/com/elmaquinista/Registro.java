
package com.elmaquinista;

import java.util.ArrayList;

public class Registro {
    private String nombre;
    private String dia;
    private String mes;
    private String anio;
    private String anotacion;
    private final String repuesto = "aceite";
    private final String repuestoDos = "llantas";
    private final String repuestoTres = "motor";
    private final String repuestoCuatro = "frenos";
    private final String repuestoCinco = "luces";
    
    
    public Registro(){
        
    }
    
    public Registro(String nombre, String dia, String mes, String anio, String anotacion){
        this.nombre=nombre;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.anotacion=anotacion;
    }
    
    public void mensajeSalida(){
        System.out.println("Ok señor "+nombre+ " se ingresó a la base de datos la siguiente informacion: ");
        System.out.println(anotacion);
        System.out.println("Con fecha:  "+ dia+"/"+mes+"/"+ anio); 
    }
    
    public void mostrarRespuestos(){
            System.out.println("Este es el inventario de las reparaciones relaizadas: ");
            System.out.println("1. ---->" + repuesto);
            System.out.println("2. ---->" + repuestoDos);
            System.out.println("3. ---->" + repuestoTres);
            System.out.println("4. ---->" + repuestoCuatro);
            System.out.println("5. ---->" + repuestoCinco);
}

    public String getNombre() {
        return nombre;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAnio() {
        return anio;
    }

    public String getAnotacion() {
        return anotacion;
    }
    
    
    
}
