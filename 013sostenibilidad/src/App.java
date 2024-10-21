import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int puntuación = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas veces a la semana comes carne?");

        boolean acccarne = true;

        do {

            int carne = sc.nextInt();

            if (carne > 7 || carne < 0) {

                System.out.println("Es posible 7 dias y minimo 0, inserte un valor posible");

            } else {
                puntuación += carne * 5;

                acccarne = false;
            }

        } while (acccarne == true);

        System.out.println("¿Cuántas veces a la semana usas transporte privado (como coche o moto)?");

        boolean acccoche = true;

        do {

            int coche = sc.nextInt();

            if (coche > 7 || coche < 0) {

                System.out.println("Es posible 7 dias y minimo 0, inserte un valor posible");

            } else {
                puntuación += coche * 2;

                acccoche = false;
            }

        } while (acccoche == true);

        System.out.println("¿Cuántas veces a la semana usas transporte público?");

        boolean accbus = true;

        do {

            int bus = sc.nextInt();

            if (bus > 7 || bus < 0) {

                System.out.println("Es posible 7 dias y minimo 0, inserte un valor posible");

            } else {
                puntuación += bus;

                accbus = false;
            }

        } while (accbus == true);

        System.out.println("¿Cuántos productos reciclables (plástico, papel, vidrio) sueles reciclar cada\r\n" + //
                " * semana?");

        boolean accre = true;

        do {

            int re = sc.nextInt();

            if (re > 7 || re < 0) {

                System.out.println("Es posible 7 dias y minimo 0, inserte un valor posible");

            } else {
                puntuación -= re * 2;

                accre = false;
            }

        } while (accre == true);

        System.out.println("¿Dejas las luces encendidas al salir de una habitación? (true/false)");

        boolean luz = sc.nextBoolean();

        if (luz == true) {

            puntuación += 10;

        }

        System.out.println("¿Cuántos litros de agua crees que usas al día? (ej.: 50, 100, 150)");

        int agua = sc.nextInt();

        puntuación = agua / 10;

        System.out.println(puntuación);

        int estrella = (int) Math.ceil(puntuación) / 10;

        for(int i = 0 ; i < estrella; i += 10 ){

            System.out.print("*");

        }

        System.out.println();

        if (puntuación < 30) {

            System.out.println("¡Excelente! Estás contribuyendo al medio ambiente.");
            
        } 

        else if (puntuación > 30 && puntuación < 60) {
            
            System.out.println("Bien, pero hay margen para mejorar.");

        }

        else if (puntuación > 60){

            System.out.println("Tu huella es alta, intenta mejorar algunos hábitos.");

        }

    }
}

/*
 * Objetivo: Desarrollar un programa en Java que simula una calculadora básica
 * de huella ecológica.
 * 
 * Enunciado:
 * 
 * La huella ecológica mide la cantidad de recursos que una persona consume y su
 * impacto en el medioambiente. La actividad consiste en implementar un programa
 * que realice una versión simplificada de una calculadora de huella ecológica.
 * 
 * Crea un programa en Java llamado CalculadoraHuellaEcologica.java que haga lo
 * siguiente:
 * 
 * Entrada de datos:
 * 
 * El programa deberá solicitar al usuario información sobre:
 * 
 * ¿Cuántas veces a la semana comes carne?
 * ¿Cuántas veces a la semana usas transporte privado (como coche o moto)?
 * ¿Cuántas veces a la semana usas transporte público?
 * ¿Cuántos productos reciclables (plástico, papel, vidrio) sueles reciclar cada
 * semana?
 * ¿Dejas las luces encendidas al salir de una habitación? (Sí/No)
 * ¿Cuántos litros de agua crees que usas al día? (ej.: 50, 100, 150)
 * 
 * Cálculo de la puntuación total:
 * 
 * Carne: +5 puntos por cada día que consumes carne.
 * Transporte privado: +2 puntos por cada día.
 * Transporte público: +1 punto por cada día.
 * Reciclaje: -2 puntos por cada producto reciclado.
 * Luces encendidas: +10 puntos si la respuesta es "Sí".
 * Consumo de agua: +1 punto por cada 10 litros (ej.: si responde 100, son +10
 * puntos).
 * 
 * Salida del resultado:
 * 
 * La puntuación: El resultado será un número entero que representa la huella
 * ecológica total del usuario.
 * Representación con estrellas: Cada estrella representa 10 puntos de la
 * huella.
 * Redondea hacia arriba si la puntuación no es múltiplo de 10 (Usar Math.ceil).
 * Ejemplo: Puntuación 53 → 6 estrellas
 * Ejemplo: Puntuación 47 → 5 estrellas
 * Mensajes personalizados según la puntuación:
 * 
 * Menos de 30 puntos: "¡Excelente! Estás contribuyendo al medio ambiente."
 * Entre 30 y 60 puntos: "Bien, pero hay margen para mejorar."
 * Más de 60 puntos: "Tu huella es alta, intenta mejorar algunos hábitos."
 * 
 * Nota: Ejemplo de uso de Math.Ceil:
 * 
 * int ejemplo = (int) Math.ceil(numero)
 * 
 * System.out.println(ejemplo)
 * 
 * Si numero=4,6 -> ejemplo=5
 * 
 * Forma de entrega
 * 
 * Subir el archivo CalculadoraHuellaEcologica.java
 * Subir captura de pantalla de realizar la encuesta de huella digital:
 * https://www.urjc2030.es/ov/mejora-y-reduce-tu-huella-ecologica/calculadora-
 * huella-ecologica/
 * 
 */