package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println(ceroEsNull(1));

    }

    public static int suma(int a, int b) {

        return a + b;
        
    }

    public static boolean booleanoInverso(boolean bool) {

        return bool == false;
        
    }

    public static Integer ceroEsNull (int numero) {

        return (numero == 0) ? null : numero;

    }

}
