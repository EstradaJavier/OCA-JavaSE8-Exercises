package com.company;

/****************************************************************************************
 *  --  Java StringBuffer class is used to create mutable (modifiable) String objects.
 *  --  The StringBuffer class in Java is the same as String class except it is mutable
 *  --  i.e. it can be changed.
 *  --
 *  --  Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access
 *  --  it simultaneously. So it is safe and will result in an order.
 *  --
 *  --  It creates an empty String buffer with the initial capacity of 16.
 *  --
 *  --  If the number of character increases from its current capacity, it increases the
 *  --  capacity by (oldcapacity*2)+2. For example if your current capacity is 16,
 *  --  it will be (16*2)+2=34.
 *  --
 *  -- StringBuffer is slower than StringBuilder because it is thread-safe.
 *****************************************************************************************/

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello ");

        sb.append("Java");          //now original string is changed
        System.out.println(sb);     //prints Hello Java
    }
}

