package com.corenetworks.modelo;

import java.security.PublicKey;

public class Pedido {

    //Atributo
    private int idPedido;
    private double importe;
    private char formaPago;
    //Métodos
    public double calcularIVA(double porcentaje){
        return importe * porcentaje;
    }

    public String mostrarInfo(){
        return "Id Pedido : " + idPedido +
                " Importe : " + importe +
                " Forma de pago : " + formaPago;
    }

    //Setters
    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }

    public void setImporte(double importe){
        this.importe = importe;
    }

    public void setFormaPago(char formaPago){
        this.formaPago = formaPago;
    }
    //Getters
    public int getIdPedido(){
        return idPedido;
    }

    public double getImporte(){
        return importe;
    }

    public char getFormaPago(){
        return formaPago;
    }


}


