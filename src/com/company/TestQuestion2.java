package com.company;

public class TestQuestion2 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);  // Here, we ask a boolean question.
        // -- These relational operators will return a boolean value : ( ==, !=, <, >, >=, <=)

        System.out.println(sb1);
    }
}
