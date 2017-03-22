package com.jwilson;

/**
 * Created by jwilson on 22/03/2017.
 */
public class Main {

    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Car model is: " + porsche.getModel());

    }
}
