package com.company;

/****************************************************************************************
 *  --  An interface is a group of related methods with empty bodies.
 *  --  Do not have instanced specific variables or methods.
 *  --  Do not have private variables or methods.
 *  --  All methods in an interface are public and abstract.
 *  --
 *  --
 *  --
 *  -- (interface = behaviours). can eat, can poop, can walk, can run.
 *****************************************************************************************/

public interface AnimalBehaviour {

    public void eat();
    public void poop();
    public void walks();
    public void run();

}
