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
    public static void main(String[] args) {

        System.out.println("\n=== INICIALIZAÇÃO DO SISTEMA ===");

        // Criação de dispositivos
        Dispositivo sensor = FabricaDeDispositivos.criarDispositivo("1", "Temperatura", "sensor");
        Dispositivo atuador = FabricaDeDispositivos.criarDispositivo("2", "Ventilador", "atuador");

        // Gerenciador do sistema (Singleton)
        GerenciadorDoSistema gerenciador = GerenciadorDoSistema.getInstancia();
        gerenciador.registrarDispositivo(sensor);
        gerenciador.registrarDispositivo(atuador);

        // Command: ação para ligar ventilador
        Comando ligarVentilador = new ComandoLigarVentilador(atuador);

        // Observer: um único gerenciador de eventos
        GerenciadorDeEventos eventos = new GerenciadorDeEventos();

        // Ouvinte que reage automaticamente se a temperatura passar de 30°C
        eventos.inscrever(e -> {
            System.out.println("Evento recebido: " + e.getTipo() + " = " + e.getValor());
            if ("Temperatura".equalsIgnoreCase(e.getTipo())) {
                String digits = e.getValor().replaceAll("[^0-9-]", "");
                try {
                    int temp = Integer.parseInt(digits);
                    if (temp > 30) {
                        System.out.println("Temperatura acima de 30°C! Acionando ventilador...");
                        ligarVentilador.executar();
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Valor de temperatura inválido: " + e.getValor());
                }
            }
        });

        // Simulação de leitura de temperatura
        Evento eventoTemperatura = new Evento("Temperatura", "32°C");
        eventos.publicar(eventoTemperatura);

        // Strategy: resposta ao evento (exemplo)
        EstrategiaDeRespostaAoEvento estrategia = new EstrategiaDeRespostaImediata();
        estrategia.responder(eventoTemperatura);

        // Decorator + Composite: tema
        ComponenteDeTema temaBasico = new TemaBasico();
        ComponenteDeTema temaEscuro = new DecoradorTemaEscuro(temaBasico);
        temaEscuro.renderizar();

        System.out.println("\n=== FIM DA SIMULAÇÃO ===\n");
    }
}
