package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Calculadora {

    public static int suma(int a, int b) {

        return b + a;

    };

    public static boolean esPar(int num) {

        return (num % 2 == 0) ? true : false;

    }

    public static String obtenerMensaje (String nombre, int edad) {

        if (edad < 18) {

            return "Hola " + nombre + ", eres menor de edad.";

        } else if (edad >= 18 && edad <= 59) {

            return "Hola " + nombre + ", bienvenido al sistema.";

        } else { 

            return "Hola " + nombre + ", esperamos que tengas un gran día.";

        }

    }

    public static void archivoError(){

        try {

            FileWriter fw = new FileWriter("no existe");
            
            
        } catch (Exception e) {

            e.getMessage();

            
        }

        

    }

}
