
package com.almacenamiento;


public class Contacto {
    private String nombre;
    private String organizacion;
    private String telefono;

public Contacto(String nombre, String organizacion, String telefono ){
    this.nombre= nombre;
    this.organizacion = organizacion;
    this.telefono = telefono;
}

    public String getNombre() {
        return nombre;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Organizacion: " + organizacion + "\n" + "Telefono: " + telefono;
    }


}
