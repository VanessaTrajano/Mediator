package org.example;

public class Manutencao implements AreaServico{
    private static Manutencao instancia = new Manutencao();

    private Manutencao() {}

    public static Manutencao getInstancia() {
        return instancia;
    }

    @Override
    public String solicitarReparo(String mensagem) {
        return "A equipe de Manutenção agendou o reparo para: " + mensagem;
    }

    @Override
    public String reportarIncidente(String mensagem) {
        return "A equipe de Manutenção isolou a área devido ao incidente: " + mensagem;
    }

    @Override
    public String solicitarInformacao(String mensagem) {
        return "A equipe de Manutenção enviou os detalhes sobre: " + mensagem;
    }
}
