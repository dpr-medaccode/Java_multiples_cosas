package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {
    /**
     * Rigorous Test :-)
     */

     @Test
     public void testSuma() {
 
         assertEquals(5, Calculadora.suma(2, 3));
 
     }

     @Test
     public void testPar() {

         assertTrue(Calculadora.esPar(2));
 
     }

     @Test
     public void testImpar() {

         assertFalse(Calculadora.esPar(1));
 
     }

     @Test
     public void testEdadMas() {

        assertEquals("Hola Juan, bienvenido al sistema.", Calculadora.obtenerMensaje("Juan", 19));
 

     }


     @Test
     public void testEdadMenos() {

        assertEquals("Hola Juan, eres menor de edad.", Calculadora.obtenerMensaje("Juan", 17));

 
     }


     @Test
     public void testEdadIgual() {

        assertEquals("Hola Juan, esperamos que tengas un gran día.", Calculadora.obtenerMensaje("Juan", 61));
 
     }

     @Test
     public void leerArchivo() {

        Calculadora.archivoError();
 
     }


}
