package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class Probarproducto {


    public static void main (String[] args){
        Producto p1 = new Producto();
        p1.setIdProducto(5); //p1 = idproducto =5
        p1.setNombre("El raton gris");
        p1.setCantidadExistencia(100);

        System.out.println("id:"+ p1.getIdProducto());
        System.out.println("Nombre" + p1.getNombre());


    }

}
