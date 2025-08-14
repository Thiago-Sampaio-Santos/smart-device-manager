package main.dispositivos;

// Interface base para todos os dispositivos
// Aplica o principio SRP e OCP
public interface Dispositivo {
    String getId();
    String getTipo();
    void executarAcao(String command);
}

