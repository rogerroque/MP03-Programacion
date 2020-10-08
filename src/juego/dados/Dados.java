package juego.dados;

import java.util.Random;

public class Dados {

    Random random = new Random();

    private int valorDado;

    public int getValorDado() {
        return valorDado;
    }

    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }

    @Override
    public String toString() {
        return "" + valorDado;
    }

    public void tirar() {

        valorDado = random.nextInt(6) + 1;

    }
}
