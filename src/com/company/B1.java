package com.company;

public class B1 extends CovariantReturnType {

    B1 get() {
        return this;
    }
    void message() {
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]) {
        new B1().get().message();
    }
}
