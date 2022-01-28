package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        int acc1 = 0;
        int acc2 = 0;
        int acc3 = 0;

        for (var i = 1; i <= 100; ++i) {
            if (i % 15 == 0) {
                acc1 += 1;
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                acc2 += 1;
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                acc3 += 1;
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("FizzBuzz   was printed out     : " + acc1);
        System.out.println("Fizz       was printed out     : " + acc2);
        System.out.println("Buzz       was printed out     : " + acc3);
    }
}
