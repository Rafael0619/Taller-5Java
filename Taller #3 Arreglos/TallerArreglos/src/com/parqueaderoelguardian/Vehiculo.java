
package com.parqueaderoelguardian;


public class Vehiculo {
    private String placa;
    private String marca;
    private String nombre;
    private String telefono;

    public Vehiculo(String placa, String marca, String nombre, String telefono) {
        this.placa = placa;
        this.marca = marca;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  "Placa: " + placa +"\n"+ "Marca: " + marca + "\n"+"Nombre:" + nombre +"\n" +"Telefono=" + telefono;
    }

    
   
    
    
}
