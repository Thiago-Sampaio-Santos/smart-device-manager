package main;

import main.dispositivos.Dispositivo;
import main.factory.FabricaDeDispositivos;
import main.manager.GerenciadorDoSistema;

public class App {
    public static void main(String[] args) throws Exception {
        Dispositivo sensor = FabricaDeDispositivos.criarDispositivo("1", "Temperatura", "sensor");
        Dispositivo atuador = FabricaDeDispositivos.criarDispositivo("2", "Ventilador", "atuador");

        GerenciadorDoSistema gerenciador = GerenciadorDoSistema.getInstancia();
        gerenciador.registrarDispositivo(sensor);
        gerenciador.registrarDispositivo(atuador);

        gerenciador.executarComando("1", "Detectar temperatura");
        gerenciador.executarComando("2", "Ligar ventilador");
    }
}
