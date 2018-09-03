package com.lokesh.tutorial;

public class Main {

    public static void main(String[] args) {
        Flight flight1 = new Flight();
        flight1.setFlightNumber(12);

        Flight flight2 = new Flight();
        flight2.setFlightNumber(12);

        System.out.println(flight1 == flight2); //false - pointing to two different objects in memory

        System.out.println(flight1.equals(flight2)); //True - overriding equal method provided by object class and setting equal criteria.

    }

}
