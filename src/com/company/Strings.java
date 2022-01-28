package com.company;

public class Strings {
    public static void main(String[] args) {

        String  MyName = "Javier P Estrada";

        String newString = MyName.substring(10, 13).toUpperCase();
        System.out.println(newString);
        System.out.println(MyName.indexOf("J")); // Proof that strings are zero indexed.


    }
}
