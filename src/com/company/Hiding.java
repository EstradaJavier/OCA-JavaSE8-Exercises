package com.company;

public class Hiding {

        public static class A {

            public int x = 3;
            public int getX() {
                return x;
            }

            public boolean isXFive() {
                return (getX() == 5);
            }

            public static boolean makeTrue() {
                return true;
            }
        }

        public static class B extends A {
            public int x = 5;
            @Override
            public int getX() {
                return x;
            }

            public static boolean makeTrue() {
                return false;
            }
        }

        public static void main(final String... pArgs) {
            final A a = new A();
            final B b = new B();
            final A b2 = new B();
            System.out.println(((A) b).x + " : " + b.x);
            System.out.println(((A) b).makeTrue() + " : " + b.makeTrue());
            System.out.println(((A) null).makeTrue());
            System.out.println(((A) b).isXFive());
            System.out.println(b.isXFive());
            System.out.println(b2.makeTrue()); // makeTrue is static and b2 is an A-pointer, so this will print "true"
            System.out.println(b2.getX());    // getX is *not* static and b2 *points* to a B, so this will print 5
            System.out.println(b2.makeTrue() + " : " + b2.getX());
            // A: false : 3
            // B: false : 5
            // C: true : 3
            // D: true : 5
        }
}
