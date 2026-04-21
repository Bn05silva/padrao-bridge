package app;

import dispositivos.TV;
import dispositivos.Radio;
import controles.ControleRemoto;
import controles.ControleAvancado;

public class App {
    public static void main(String[] args) {
        ControleRemoto controleTV = new ControleRemoto(new TV());
        controleTV.ligar();
        controleTV.desligar();

        ControleAvancado controleRadio = new ControleAvancado(new Radio());
        controleRadio.ligarEdesligar();
    }
}
