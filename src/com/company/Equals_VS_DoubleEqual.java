package com.company;

public class Equals_VS_DoubleEqual {
    public static void main(String[] args) {

        String string1 = new String("Hello World!");
        String string2 = new String("Hello World!");

        if(string1 == string2) {
            System.out.println("The strings are (==) equal.");
        } else {
            System.out.println("The strings are not (==) equal.");
        }

        if(string1.equals(string2)) {
            System.out.println("The strings are .equal() equal.");
        } else {
            System.out.println("The strings are not .equal() equal.");
        }

    }
}
