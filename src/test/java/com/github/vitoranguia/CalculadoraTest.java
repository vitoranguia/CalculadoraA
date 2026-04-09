package com.github.vitoranguia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
    }
}