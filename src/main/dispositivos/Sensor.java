package main.dispositivos;

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
    public String getType() {
        return type;
    }

    @Override
    public void executarAcao(String command) {
        System.out.println("\nO Sensor " + id + " recebeu o comando: " + command);
    }
}

