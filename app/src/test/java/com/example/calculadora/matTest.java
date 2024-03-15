package com.example.calculadora;

import junit.framework.TestCase;

public class matTest extends TestCase {
    private int n1 = 2;
    private int n2 = 3;
    public void testSuma() {
        assertEquals(5.0,mat.suma(n1,n2));
    }

    public void testResta() {
        assertEquals(-1.0,mat.resta(n1,n2));
    }

    public void testMultiplicacion() {
        assertEquals(6.0,mat.multiplicacion(n1,n2));
    }

    public void testDivision() {
        assertEquals(0.6667, mat.division(n1,n2));
    }

    public void testFactorial() {
        assertEquals(2, mat.factorial(n1));
    }
}