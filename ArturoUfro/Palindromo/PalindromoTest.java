package org.example.out.production.ArturoUfro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void esPalindromo() {
        assertTrue(Palindromo.esPalindromo("radar"));
        assertTrue(Palindromo.esPalindromo("#$%%$#"));
        assertFalse(Palindromo.esPalindromo("#%!"));
        assertTrue(Palindromo.esPalindromo("La tele letal"));
        assertTrue(Palindromo.esPalindromo("Juan NAUj"));
    }

    @Test
    void validarPalabra() {

    }
}