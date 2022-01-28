package com.company;

/****************************************************************************************
 *  --  Java StringBuilder class is used to create mutable (modifiable) String.
 *  --  The Java StringBuilder class is same as StringBuffer class except that
 *  --  it is non-synchronized.
 *  --
 *  --  It does not contain synchronized methods.
 *  --  It creates an empty String buffer with the initial capacity of 16.
 *  --
 *  --  If the number of character increases from its current capacity, it increases the
 *  --  capacity by (old capacity * 2) + 2. For example if your current capacity is 16,
 *  --  it will be (16 * 2) + 2 = 34.
 *  --
 *  --  StringBuilder is faster than StringBuffer because it does not need to
 *  --  be thread-safe.
 *****************************************************************************************/

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello ");

        sb.append("JavaFX");                //now original string is changed
        System.out.println(sb);             //prints "Hello JavaFX"

        StringBuilder sb2 = new StringBuilder("surprise!").insert(3, "!!");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("surprised!!!").replace(3, 3, " JAVI ");
        System.out.println(sb3);
    }
}
