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
 *
 *  --  With interfaces, all fields are automatically public, static, and final, and all
 *  --  methods that you declare or define (as default methods) are public.
 *****************************************************************************************/

public interface AnimalBehaviour {

    public void eat();
    public void poop();
    public void walks();
    public void run();

}
