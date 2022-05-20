
package com.padresehijos;


public class Persona {
    protected  String nombres;
    protected  String apellidos;

    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public  String nombreCompleto(){
        String nombreCompleto = nombres + " " + apellidos;
        return nombreCompleto;
    }
}
