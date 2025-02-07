package com.arcedios.bbodega.Aqui.ModelView;

public class Administrativo {
    private String nombre;
    private String cedula;

    public Administrativo(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Administrativo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
