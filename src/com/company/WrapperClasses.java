package com.company;

public class WrapperClasses {
    public static void main(String[] args) {

        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.ArrayList)

        // primitive       // wrapper (reference data types)
        // ---------       // -------
        // boolean            Boolean
        // char               Character
        // int                Integer
        // double             Double

        // autoboxing = the automatic conversion that the Java Compiler makes between the
        // primitive types and the corresponding object wrapper classes
        //
        // unboxing   = the reverse of autoboxing. Automatic conversion of wrapper class
        // to primitive

        // Let's use autoboxing to assign a few primitive data types to each corresponding
        // wrapper class to create a reference data type.

        Boolean a = true;  // using AUTOBOXING to directly assigning a primitive value
                           // to the reference data type.
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Javier P Estrada";  // string are already a reference data type.

        // a few of the methods of boolean wrapper classes.


        // UNBOXING = converting a wrapper class into it's primitive value.
        // with UNBOXING, we can treat these reference data type variables
        // as if they were standard primitive values.

        

    }
}
