package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {

        String[] fruits = new String[4];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        fruits[3] = "Watermelon";


        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");


        fruitList.set(1, "Bananna");     //  ArrayList are zero indexed.

 //     fruitList.set(4, "Bananna");     //  IndexOutOfBoundsException:
                                         //  Index 4 out of bounds for length 4

//        fruitList.remove("Strawberry");
//        fruitList.sort(Comparator.naturalOrder());
        System.out.println("Ourt fruits in natural order : " + fruitList);
//		fruitList.clear();
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList.size());
        System.out.println(fruitList.size());


    }
}
