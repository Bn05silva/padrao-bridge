package controles;

import dispositivos.Dispositivo;

public class ControleAvancado extends ControleRemoto{
    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void ligarEdesligar() {
        dispositivo.ligar();
        dispositivo.desligar();
    }
}
