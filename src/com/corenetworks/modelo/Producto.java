package com.corenetworks.modelo;

public class Producto {

    //Atributos

    private int idProducto;
    private String nombre;

    private int cantidadExistencia;
    //Setters
    public void setIdProducto(int valor){
        idProducto = valor;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCantidadExistencia(int cantidadExistencia){
        this.cantidadExistencia = cantidadExistencia;
    }

    //Getters
    public int getIdProducto(){
        return idProducto;
    }
    public String getNombre(){
        return nombre;
    }

}
