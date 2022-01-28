package com.company;

/****************************************************************************************
* --  This is the parent (super) class.
* --  private, public, instance specific variables.
* --  Everything is public and open
* --  Add fields that all animals (subclasses) will share.
* --  Making this class Abstract, makes so that you can't instantiate it,
* --  but you can make subclasses of it.
* --  Have specific variables and methods.
* --  Abstract classes enforce and organize exactly what every subclass of
* --  Animal has to have.
* --  Contract will enforce that every single animal type will have a name,
* --  and age, and makeNoise.
*
* ***************************************************************************************/


public abstract class Animal {
    int age;
    String name;

    public abstract void makeNoise();

    public void printName() {
        System.out.println("My name is : " + name);
    }
}
