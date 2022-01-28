package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_v_LinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final long startTimeLL = System.nanoTime();
        linkedList.get(5000);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.get(5000);
        final long endTimeAL = System.nanoTime();

        long totalTimeLL = endTimeLL - startTimeLL;
        long totalTimeAL = endTimeAL - startTimeAL;

        System.out.println("Total time for our LinkedList is : " + totalTimeLL);
        System.out.println("Total time for our ArrayList is  : " + totalTimeAL);
    }
}

