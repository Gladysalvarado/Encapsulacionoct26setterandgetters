package com.corenetworks.presentacion;


import com.corenetworks.modelo.Proveedor;

public class Probarproveedor {


    public static void main(String[] args) {
        Proveedor p1 = new Proveedor();
        p1.setIdProveedor(10);
        p1.setNombre("Mercadona");
        p1.setTelefono("1234567890");
        p1.setCantidadEmpleados(3_000);

        System.out.println("Id Proveedor " + p1.getIdProveedor() +
                " Nombre : " + p1.getNombre() +
                " Telefono : " + p1.getTelefono() +
                " Cantidad empleados : "+ p1.getCantidadEmpleados());


    }
    
}
