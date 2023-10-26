package com.corenetworks.presentacion;

import com.corenetworks.modelo.Mensaje;

import java.util.Scanner;

public class Probarmensaje {
    public static void main(String[] args) {
        //        //1.Declaramos variables
        Mensaje m1= new Mensaje();
        Scanner sc= new Scanner(System.in);
//        //Solicitar datos
        System.out.println("Escriba un mensaje -> ");
        m1.setSaludo(sc.nextLine());
        System.out.println("Escriba una ipOrigen ->");
        m1.setIpOrigen(sc.nextLine());
        System.out.println("Escriba una ipDestino ->");
        m1.setIpDestino(sc.nextLine());

        System.out.println(m1.mostrarInfo());

        System.out.println(m1.calcularNumeroPalabras("numero de palabras!"+m1.getSaludo()));

    }
}
