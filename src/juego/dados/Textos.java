package juego.dados;

import java.io.IOException;

public class Textos {

    public void elMenu() {
        System.out.println("-----------------------------------\n");

        System.out.println("1. Dados");
        System.out.println("2. Parchis");
        System.out.println("3. Tic Tac Toe");
        System.out.println("4. TFT\n");

        System.out.println("0. Salir\n");

        System.out.println("-----------------------------------\n");
    }

    public void queQuieresJugar() {
        System.out.print("Que quieres jugar? 1-4: ");
    }

    public void elijeUnaOpcion() throws IOException, InterruptedException {
        System.out.print("Solo puedes elejir entre 1-4!!!!!!: ");
    }

    public void tirarOtravez() {
        System.out.printf("\nTirar otra vez (y) | Salir (n): ");
    }


    public void enterPrimeraTirada() {
        System.out.print("\nPresiona Enter para hacer la primera tirada ");
    }

    public void enterParaElMenu() {
        System.out.print("Presiona Enter para volver al menu principal ");
    }

}