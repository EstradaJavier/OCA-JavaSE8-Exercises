package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsAndStreams {
    public static void main(String[] args) {

        //Usage of collections

        //Collections are mainly used to store the data

        //Here, names are stored as List

        List<String> names = new ArrayList<>();
        names.add("Alesha");
        names.add("Javier");
        names.add("Teresa");
        names.add("Jade");
        names.add("Anthony");
        names.add("Bear");

        //Usage of streams
        //Streams are mainly used to perform operations on data
        //like selecting only unique names

        names.stream()
             .distinct()
             .sorted(Comparator.reverseOrder())
             .forEach(System.out::println);
    }
}
