package com.foilen.primitives;

public class Primitives {

    public static void main(String[] args) throws Exception {

        castingAndOperations();

        smallAndLargeFloat();

        overflow();

    }

    private static void castingAndOperations() {

        System.out.println("---[castingAndOperations]---");

        int i2 = 2;
        int i5 = 5;

        float f2 = 2;

        // Division
        System.out.println("i5 / i2 = " + (i5 / i2));
        System.out.println("i5 / f2 = " + (i5 / f2));

        // Casting
        long lMax = Long.MAX_VALUE;
        System.out.println("lMax: " + lMax);
        System.out.println("lMax in int: " + (int) lMax);

        double dMax = Double.MAX_VALUE;
        System.out.println("dMax: " + dMax);
        System.out.println("dMax in float: " + (float) dMax);

        // As numbers
        System.out.println("5 / 2 = " + (5 / 2)); // int / int -> int
        System.out.println("5 / 2.0 = " + (5 / 2.0)); // int / double -> double
        System.out.println("5 / 2.0f = " + (5 / 2.0f)); // int / float -> float

        System.out.println("5d / 2 = " + (5d / 2)); // double / int -> double
    }

    private static void smallAndLargeFloat() {

        System.out.println("---[smallAndLargeFloat]---");

        System.out.println(0.000_000_000_000_000_000_01f);
        System.out.println(100_000_000_000_000_000_000f); // Si on omet le f: erreur

    }

    private static void overflow() throws Exception {

        System.out.println("---[overflow]---");

        int i = Integer.MAX_VALUE - 2;
        System.out.println(i++); // -2
        System.out.println(i++); // -1
        System.out.println(i++); // Loop
        System.out.println(i++);

    }

}
