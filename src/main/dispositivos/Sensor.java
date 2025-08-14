package main.dispositivos;

// Classe concreta que representa os sensores
public class Sensor implements Dispositivo {
    private String id;
    private String type;
    
    public Sensor(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String getId() {
       return id;
    }

    @Override
    public String getTipo() {
        return type;
    }

    @Override
    public void executarAcao(String command) {
        System.out.println("\nO Sensor " + id + " recebeu o comando: " + command);
    }
}

