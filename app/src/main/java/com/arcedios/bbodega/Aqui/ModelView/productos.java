package com.arcedios.bbodega.Aqui.ModelView;

public class productos {
    private String nombre;
    private int cantidad;
    private String codigo;

    public productos(String nombre,int cantidad,String codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
