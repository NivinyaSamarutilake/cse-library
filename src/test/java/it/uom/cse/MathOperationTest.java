package it.uom.cse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MathOperationTest {

    @Test
    void add() {
        assertEquals(MathOperation.add(1, 1), 2);
    }

    @Test
    void subtract() {
        assertEquals(MathOperation.subtract(2, 1), 1);
    }

    public static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

}