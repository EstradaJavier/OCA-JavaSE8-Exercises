package com.company;

/*********************************************************************************************
*  --  An abstract class is a class that is declared abstract—it may or may not include
*  --  abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
 *
*  -- An abstract method is a method that is declared without an implementation
*  --  (without braces, and followed by a semicolon), like this:
*  --                         abstract void moveTo(double deltaX, double deltaY);
*
*
*
*  --    NOTE:  An abstract METHOD may not be marked final because:
*  --    The method cannot be instantiated directly and must be implemented
*  --    by a subclass. By marking the method final, no subclass can implement it.
*  Therefore, no concrete subclass could be created that includes the method.
*  --
*  --  With interfaces, all fields are automatically public, static, and final, and all
*  --  methods that you declare or define (as default methods) are public.
**********************************************************************************************/
public class AbstractClasses {

    public static void main(String[] args) {

        Cat myCat = new Cat();              //  Creating a Cat object.
        myCat.makeNoise();

    }
}
