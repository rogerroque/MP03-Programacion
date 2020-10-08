package juego.dados;

import java.awt.event.KeyAdapter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LosDadosElJuego extends KeyAdapter {

    Scanner scanner = new Scanner(System.in);
    ClearScreen cls = new ClearScreen();
    Textos textos = new Textos();
    Menu menu = new Menu();

    public void Jugar() throws IOException, InterruptedException {

        Dados dado1 = new Dados();
        Dados dado2 = new Dados();
        Dados dado3 = new Dados();

        boolean tirada = true;
        int partidas = 0;
        int victoria = 0;
        int derrota = 0;

        cls.clearScreen();
        textos.enterPrimeraTirada();
        System.in.read();

        while (tirada) {

            cls.clearScreen();

            partidas++;
            System.out.println("Partidas: " + partidas + "\n");

            dado1.tirar();
            dado2.tirar();
            dado3.tirar();

            System.out.println("Dado1: " + dado1.toString());
            System.out.println("Dado2: " + dado2.toString());
            System.out.println("Dado3: " + dado3.toString());

            if (dado1.getValorDado() == dado2.getValorDado() && dado1.getValorDado() == dado3.getValorDado()) {
                victoria++;
            } else {
                derrota++;
            }

            System.out.println("\nGanadas: " + victoria + "  Perdidas: " + derrota);


            textos.tirarOtravez();
            String si = scanner.next();

            if (!si.contains("y")) {
                tirada = false;
            }
        }

        cls.clearScreen();
        System.out.println("\n     Resultados");
        System.out.println("\n|------------------|\n");
        System.out.println("     Partidas: "+ partidas + "\n");
        System.out.println("     Ganadas: "+ victoria);
        System.out.println("     Perdidas: "+ derrota +"\n");
        System.out.println("|------------------|\n");

        textos.enterParaElMenu();
        System.in.read();

        menu.MenuJuego();

    }
}

