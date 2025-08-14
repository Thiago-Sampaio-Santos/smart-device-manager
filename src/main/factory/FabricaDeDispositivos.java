package main.factory;

import main.dispositivos.Atuador;
import main.dispositivos.Dispositivo;
import main.dispositivos.Sensor;
//Aplica o padrão Factory Method
public class FabricaDeDispositivos {
    public static Dispositivo criarDispositivo(String id, String type, String category) {
        switch (category.toLowerCase()) {
            case "sensor":
                return new Sensor(id, type);
            case "atuador":
                return new Atuador(id, type);
            default:
                throw new IllegalArgumentException("Categoria desconhecida: " + category);
        }
    }
}
