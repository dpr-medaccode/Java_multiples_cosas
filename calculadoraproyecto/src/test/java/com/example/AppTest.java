package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testSuma() {

        assertEquals(5, App.suma(1, 3), "test");

    }

    @Test
    public void shouldAnswerWithTrue() {

        assertTrue(false);

    }

    @Test
    public void testinversotrue() {

        assertTrue(App.booleanoInverso(true));

    }

    @Test
    public void testinversofalse() {

        assertFalse(App.booleanoInverso(false));

    }

    @Test
    public void testNotNull() {

        assertNotNull(App.ceroEsNull(0)); // anuque salga excepcion, en la terminalaparece correctamente
                                          // org.opentest4j.AssertionFailedError: expected: not <null>

    }

    @Test
    public void testSiNull() {

        assertNull(App.ceroEsNull(1));

    }

}
