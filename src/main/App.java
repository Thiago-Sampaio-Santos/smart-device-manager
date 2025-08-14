package main;

import main.command.Comando;
import main.command.ComandoLigarVentilador;
import main.dispositivos.Dispositivo;
import main.factory.FabricaDeDispositivos;
import main.manager.GerenciadorDoSistema;
import main.observer.Evento;
import main.observer.GerenciadorDeEventos;
import main.strategy.EstrategiaDeRespostaAoEvento;
import main.strategy.EstrategiaDeRespostaImediata;
import main.theme.ComponenteDeTema;
import main.theme.DecoradorTemaEscuro;
import main.theme.TemaBasico;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n=== INICIALIZAÇÃO DO SISTEMA ===");

        // Criação de dispositivos
        Dispositivo sensor = FabricaDeDispositivos.criarDispositivo("1", "Temperatura", "sensor");
        Dispositivo atuador = FabricaDeDispositivos.criarDispositivo("2", "Ventilador", "atuador");

        //Gerenciador do sistema
        GerenciadorDoSistema gerenciador = GerenciadorDoSistema.getInstancia();
        gerenciador.registrarDispositivo(sensor);
        gerenciador.registrarDispositivo(atuador);

        // Execução direta de comandos
        gerenciador.executarComando("1", "Detectar temperatura");
        gerenciador.executarComando("2", "Ligar ventilador");

        // Padrão Command
        Comando ligarVentilador = new ComandoLigarVentilador(atuador);
        ligarVentilador.executar();

        //Padrão Observer
        GerenciadorDeEventos gerenciadorDeEventos = new GerenciadorDeEventos();

        // Ouvinte anônimo que reage ao evento
        gerenciadorDeEventos.inscrever(evento -> {
            System.out.println("O ouvinte recebeu o evento:" + evento.getTipo());
        });

        // Publicação de evento
        GerenciadorDeEventos gerenciadorDeEventos2 = new GerenciadorDeEventos();
        Evento eventoTemperatura = new Evento("Temperatura", "32°C");
        gerenciadorDeEventos2.publicar(eventoTemperatura);

        // Padrão Strategy
        EstrategiaDeRespostaAoEvento estrategia = new EstrategiaDeRespostaImediata();
        estrategia.responder(eventoTemperatura);


        // Padrão Decorator e Composite
        ComponenteDeTema temaBasico = new TemaBasico();
        ComponenteDeTema temaEscuro = new DecoradorTemaEscuro(temaBasico);
        temaEscuro.renderizar();
        System.out.println("\n=== FIM DA SIMULAÇÃO ===\n\n");
    }
}
