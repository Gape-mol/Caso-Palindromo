package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    void esPalindromo() {
        //No palindromo
        assertFalse(main.esPalindromo("Ola"));
        //Palindromo
        assertTrue(main.esPalindromo("girafarig"));
        //Palindromo pero con mayuscula (Deberia ser falso, porque el codigo no elimina las mayusculas)
        assertFalse(main.esPalindromo("Girafarig"));
        //Frase con espacios en medio
        assertTrue(main.esPalindromo("g i r a f a r i g"));
    }
}