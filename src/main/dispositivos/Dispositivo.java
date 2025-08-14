package main.dispositivos;

public interface Dispositivo {
    String getId();
    String getType();
    void executarAcao(String command);
}

