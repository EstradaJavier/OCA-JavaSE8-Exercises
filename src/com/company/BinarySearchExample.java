package com.company;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 7, 8, 1, 3, 11, 5, 9, 10};
        Arrays.stream(numbers).sorted().forEach(System.out::println);
        Arrays.binarySearch(numbers, 1);
        System.out.println(Arrays.binarySearch(numbers, 1));
    }
}
