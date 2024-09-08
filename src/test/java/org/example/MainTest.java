package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MainTest {

    @Test
    public void testEsPalindromo() {
        assertTrue(Main.esPalindromo("anita lava la tina"));
    }

    @Test
    public void testNoEsPalindromo() {
        assertFalse(Main.esPalindromo("hola"));
    }

    @Test
    public void testNoPalindromoPorMayuscula() {
        assertFalse(Main.esPalindromo("Anita lava la tina"));
    }

    @Test
    public void testCadenaVacia() {
        assertTrue(Main.esPalindromo(""));
    }

    @Test
    public void testUnSoloCaracter() {
        assertTrue(Main.esPalindromo("a"));
    }
}