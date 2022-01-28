package com.company;

import java.util.Locale;

public class Test2 {
    public static void main(String[] args) {


        System.out.println("Java".toLowerCase() == "jaVa".toLowerCase());

        System.out.println("Java".toLowerCase());
        System.out.println("jaVa".toLowerCase());

        for(var i = 0; i <= 100; i++) {
            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

  }
}

