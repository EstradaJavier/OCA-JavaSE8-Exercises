package com.company;

/****************************************************************************************
*  --  You can't instantiate an abstract class. So don't try!
*  --  This means that we cannot create objects of abstract classes
*  --  So, you can make subclasses of an abstract class that are instantiable.
*  --
*  --    NOTE:  An abstract METHOD may not be marked final because:
*  --    The method cannot be instantiated directly and must be implemented
*  --    by a subclass. By marking the method final, no subclass can implement it.
*  Therefore, no concrete subclass could be created that includes the method.
*  --
*  --
*****************************************************************************************/
public class AbstractClasses {

    public static void main(String[] args) {

        Cat myCat = new Cat();              //  Creating a Cat object.
        myCat.makeNoise();

    }
}
