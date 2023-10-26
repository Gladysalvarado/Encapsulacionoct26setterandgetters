package com.corenetworks.presentacion;

import com.corenetworks.modelo.Pedido;

import java.util.Scanner;

public class MostrarPedido {
    public static void main(String[] args) {

        //1. Declarar variables

        Pedido p1 = new Pedido();
        Scanner teclado = new Scanner(System.in);

        //solicitar Datos
        System.out.println("esciba el id del pedido ->");
        p1.setIdPedido(teclado.nextInt());

        System.out.println("escriba el importe");
        p1.setImporte(teclado.nextDouble());

        System.out.println("escriba la forma de pago");
        p1.setFormaPago(teclado.next().charAt(0));

        System.out.println(p1.mostrarInfo());

        System.out.println("el iva es ->" + p1.calcularIVA(0.21));






    }




}
