package main.observer;

import java.util.ArrayList;
import java.util.List;

// Essa classe aplica o padrão Observer, permitindo que múltiplos módulos reajam a eventos.
public class GerenciadorDeEventos {
    private List<OuvinteDeEvento> ouvintes = new ArrayList<>();

    public void inscrever(OuvinteDeEvento ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento) {
        for (OuvinteDeEvento ouvinte : ouvintes) {
            ouvinte.aoOcorrerUmEvento(evento);
        }
    }
}

