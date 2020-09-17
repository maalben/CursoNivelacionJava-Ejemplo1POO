package main;

import clases.Vehiculo;

public class Main {

    public static void main(String [] args){

        //Instancia de una clase
        Vehiculo vehiculo = new Vehiculo();

        //Se asigna valor al atributo marca
        vehiculo.setMarca("Mazda");

        //Consultando el valor de la marca
        System.out.println("Valor de un atributo: " + vehiculo.getMarca());

        vehiculo.setNumeroPuertas(4);

        System.out.println("La cantidad de puertas del vehículo es " + vehiculo.getNumeroPuertas());

    }

}
