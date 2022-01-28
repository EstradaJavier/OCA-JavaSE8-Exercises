package com.company;


/****************************************************************************************
 *  --  (interface = behaviours). Make noise, can eat, can poop, can walk.
 *  --
 *  --
 *  --
 *  --
 *****************************************************************************************/

public class Cat implements AnimalBehaviour {


    void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {

    }

    @Override
    public void poop() {

    }

    @Override
    public void walks() {

    }

    @Override
    public void run() {

    }
}

