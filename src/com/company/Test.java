package com.company;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int a = 10;
        a += (a = 4) * a++ != 5 ? 10 : 2;  // Condition (a = 4) * a++ != 5 is always true, so + 10;
//        same as:
//        a += ( ((a = 4) * a++) != 5 ? 10 : 2 );

        System.out.println(a);

        int b = 10;

//        b += (b = 4) * b++;
        System.out.println(b);

        String name        = "Javier P. Estrada";
        String reverseName = new StringBuffer(name).reverse().toString();
        String reverseName2 = new StringBuilder(name).reverse().substring(2, 5);//  reverse, substring, toString

        System.out.println(reverseName);
        System.out.println(reverseName2);

        int[] numbers = {2,4,6,8};
        Arrays.binarySearch(numbers, 5);
        System.out.println(Arrays.binarySearch(numbers, 5));
    }
}
