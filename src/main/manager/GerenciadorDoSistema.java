package main.manager;

import java.util.HashMap;
import java.util.Map;

import main.dispositivos.Dispositivo;

// Aplica o padrão Singleton para garantir um único ponto de controle do sistema. Segue o SRP e DIP
public class GerenciadorDoSistema {
    private static GerenciadorDoSistema instancia;
    private Map<String, Dispositivo> dispositivos = new HashMap<>();

    private GerenciadorDoSistema() {}

    public static GerenciadorDoSistema getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDoSistema();
        }
        return instancia;
    }

    public void registrarDispositivo(Dispositivo dispositivo) {
        dispositivos.put(dispositivo.getId(), dispositivo);
    }

    public void executarComando (String idDispositivo, String comando) {
        if (dispositivos.containsKey(idDispositivo)) {
            dispositivos.get(idDispositivo).executarAcao(comando);
        } else {
            System.out.println("O dispositivo não foi encontrado: " + idDispositivo);
        }
    }
}
