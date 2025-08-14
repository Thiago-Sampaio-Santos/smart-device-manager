package main.dispositivos;

public class Atuador implements Dispositivo {
    private String id;
    private String type;

    
    public Atuador(String id, String type) {
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
        System.out.println("O Atuador " + id + " está executando o comando : " + command + "\n");
    }
    
}
