package com.foilen.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Final: " + fibonacci(5));

    }

    public static int fibonacci(int seq) {

        if (seq == 0 || seq == 1) {
            return display(1);
        }

        return display(fibonacci(seq - 1) + fibonacci(seq - 2));

    }

    private static int display(int i) {
        System.out.println(i);
        return i;
    }
}
