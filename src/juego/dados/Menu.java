package juego.dados;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void MenuJuego() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        LosDadosElJuego losDadosElJuego = new LosDadosElJuego();
        ClearScreen cls = new ClearScreen();
        Textos textos = new Textos();

        cls.clearScreen();
        textos.elMenu();
        textos.queQuieresJugar();
        int opcion = scanner.nextInt();

        while (opcion > 4) {
            cls.clearScreen();
            textos.elMenu();
            textos.elijeUnaOpcion();
            opcion = scanner.nextInt();
        }

        switch (opcion) {
            case 1:
                losDadosElJuego.Jugar();
                break;

            case 2:
                /*Nothing*/
                break;

            case 3: {
                /*Nothing*/
                break;
            }
            case 4: {
                /*Nothing*/
                break;
            }
            case 0: {
                cls.clearScreen();
                System.out.println("\nHasta luego\n");
                break;
            }

        }
    }
}
