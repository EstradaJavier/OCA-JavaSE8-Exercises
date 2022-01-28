package com.company;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "Javier P. Estrada";
        String strReversed = new StringBuffer(str1).reverse().toString();

        System.out.println("This is  your string reversed : " + strReversed);
    }
}
