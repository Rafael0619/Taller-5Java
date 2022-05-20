
package com.escuelaelmaestro;

public class Cliente {
    private String nombre;
    private int edad;
    private double nota;
    private String aprobacion;

    public Cliente(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\nEdad: " + edad + "\nNota: " + nota + "\n-------------->" + aprobacion;
    }

    
    
    
}
