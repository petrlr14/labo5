package com.pdm.labo_5;

/**
 * Created by uca on 04-16-18.
 */

public class Planets {

    private int id;
    private String descripcion;
    private String nombre;

    public Planets(int id, String descripcion, String nombre) {
        this.id = id;
        this.descripcion=descripcion;
        this.nombre= nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
