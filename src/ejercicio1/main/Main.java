package ejercicio1.main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nCuantas veces quieres tirar el dado?: ");
        int veces = scanner.nextInt();
        System.out.println("\nResultado: \n");

        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int contador7 = 0;
        int contador8 = 0;
        int contador9 = 0;
        int contador10 = 0;
        int contador11 = 0;
        int contador12 = 0;

        for (int i = 0; i < veces; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            if (dado1 + dado2 == 2) {
                contador2++;
            } else if (dado1 + dado2 == 3) {
                contador3++;
            } else if (dado1 + dado2 == 4) {
                contador4++;
            } else if (dado1 + dado2 == 5) {
                contador5++;
            } else if (dado1 + dado2 == 6) {
                contador6++;
            } else if (dado1 + dado2 == 7) {
                contador7++;
            } else if (dado1 + dado2 == 8) {
                contador8++;
            } else if (dado1 + dado2 == 9) {
                contador9++;
            } else if (dado1 + dado2 == 10) {
                contador10++;
            } else if (dado1 + dado2 == 11) {
                contador11++;
            } else if (dado1 + dado2 == 12) {
                contador12++;
            }

        }

        System.out.println("2   -->   " + contador2 +  " veces");
        System.out.println("3   -->   " + contador3 +  " veces");
        System.out.println("4   -->   " + contador4 +  " veces");
        System.out.println("5   -->   " + contador5 +  " veces");
        System.out.println("6   -->   " + contador6 +  " veces");
        System.out.println("7   -->   " + contador7 +  " veces");
        System.out.println("8   -->   " + contador8 +  " veces");
        System.out.println("9   -->   " + contador9 +  " veces");
        System.out.println("10  -->   " + contador10 + " veces");
        System.out.println("11  -->   " + contador11 + " veces");
        System.out.println("12  -->   " + contador12 + " veces\n");

    }

}

