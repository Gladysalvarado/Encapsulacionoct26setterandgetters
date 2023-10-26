package com.corenetworks.modelo;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String telefono;
    private int cantidadEmpleados;

    //Setters
    public void setIdProveedor(int idProveedor){
        this.idProveedor = idProveedor;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setCantidadEmpleados(int cantidadEmpleados){
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public int getIdProveedor(){
        return idProveedor;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public int getCantidadEmpleados(){
        return cantidadEmpleados;
    }
}

