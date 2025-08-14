package main.strategy;

import main.observer.Evento;

//  Essa interface define estratégias de resposta a eventos.
public interface EstrategiaDeRespostaAoEvento {
    void responder(Evento evento);
}
