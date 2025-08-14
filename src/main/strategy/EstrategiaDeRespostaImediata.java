package main.strategy;

import main.observer.Evento;

// Implementação de resposta imediata
public class EstrategiaDeRespostaImediata implements EstrategiaDeRespostaAoEvento {

    @Override
    public void responder(Evento evento) {
        System.out.println("Respondendo imediatamente ao evento: " + evento.getTipo());
    }
    
}
