package edu.alumno.ssh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random random = new Random();

        System.out.println("Numeros de la Lotería Primitiva:");

        // Genera 5 números principales
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(49) + 1;
            System.out.printf("Número %d: %d\n", i + 1, number);
        }

        // Número complementario
        int complementary = random.nextInt(49) + 1;
        System.out.printf("Número complementario: %d", complementary);

        System.out.println("¡Buena suerte en el sorteo!");
        System.out.println("Cambio realizado desde GitHub.");
    }
}
