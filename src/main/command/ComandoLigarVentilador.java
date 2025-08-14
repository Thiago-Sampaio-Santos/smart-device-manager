package main.command;

import main.dispositivos.Dispositivo;

//Comanso especifico para ligar um ventilador
public class ComandoLigarVentilador implements Comando{
    private Dispositivo dispositivo;

    public ComandoLigarVentilador(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }


    @Override
    public void executar() {
        dispositivo.executarAcao("Ligar o ventilador");
    }
}
