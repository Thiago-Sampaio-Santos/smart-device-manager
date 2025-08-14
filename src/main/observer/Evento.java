package main.observer;

// Essa classe representa um evento gerado por sensores
public class Evento {
    private String tipo;
    private String valor;

    public Evento (String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }
}

