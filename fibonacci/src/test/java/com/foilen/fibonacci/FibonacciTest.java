package com.foilen.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        Assert.assertEquals(1, Fibonacci.fibonacci(0));
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
        Assert.assertEquals(2, Fibonacci.fibonacci(2));
        Assert.assertEquals(3, Fibonacci.fibonacci(3));
        Assert.assertEquals(5, Fibonacci.fibonacci(4));
        Assert.assertEquals(8, Fibonacci.fibonacci(5));
        Assert.assertEquals(13, Fibonacci.fibonacci(6));
        Assert.assertEquals(21, Fibonacci.fibonacci(7));
    }

}
