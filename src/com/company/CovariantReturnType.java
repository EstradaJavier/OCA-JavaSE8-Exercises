package com.company;

/****************************************************************************************
 *  --  The covariant return type specifies that the return type may vary in the same
 *  --  direction as the subclass.
 *  --
 *  --  Before Java5, it was not possible to override any method by changing the return
 *  --  type. But now, since Java5, it is possible to override method by changing the
 *  --  return type if subclass overrides any method whose return type is Non-Primitive
 *  --  but it changes its return type to subclass type.
 *
 *  --  When a method in a child class overrides a method in a parent class, the return
 *  --  type is permitted to be a subclass of the return type of the method defined in
 *  --  the parent class.
 *****************************************************************************************/

public class CovariantReturnType {

    CovariantReturnType get() {
        return this;
    }
}
