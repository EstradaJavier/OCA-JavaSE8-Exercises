package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
    public static void main(String[] args) {
//  --  Java program to Reverse a String using StringBuffer
        //string
                String str1 = "Javier P. Estrada";
        //reversed string will be stored in rev1 variable
                String rev1 = new StringBuffer(str1).reverse().toString();
        //print string before reverse
                System.out.println("\nString before reversal : " + str1);
        //print string after reverse
                System.out.println("String after reversal : " + rev1);



//  --   Java Program to Reverse a String using StringBuilder
        //string
                String str2 = "Alesha M. Estrada";
        //reversed string will be stored in rev2 variable
                String rev2 = new StringBuilder(str2).reverse().toString();
        //print string before reverse
                System.out.println("\nString before reversal : "+str2);
        //print string after reverse
                System.out.println("String after reversal : "+rev2);


//       Program to reverse a string using the charAt() method
        //string
                String str4 = "Java Programming";
        //reversed string will be stored in reverseS variable
                String reverseS = "";
        //length of string will be stored in len
                int len= str4.length();
                for(int i = len-1; i >= 0; i--)
                    reverseS = reverseS + str4.charAt(i);
        //print string before reverse
                System.out.println("\nString before reversal : "+str4);
        //print string after reverse
                System.out.println("String after reversal : "+ reverseS);


//        Program to reverse a string using ArrayList object
        //string
                String str5 = "Programming Languages V1.0";
        //conversion of input string to character array
                char ch [] = str5.toCharArray();
        //add character array to object of the ArrayList
                List<Character> obj = new ArrayList<>();
                for (char c: ch)
                    obj.add(c);
        //pass the object of arraylist to collections
                Collections.reverse(obj);
        //create objecct of listiterator to iterate on list
                ListIterator objli = obj.listIterator();
        //print string before reversal
                System.out.println("\nString before reversal : "+ str5);
                System.out.println("String after reversal : ");
                while (objli.hasNext())
                    System.out.print(objli.next());
    }
}
