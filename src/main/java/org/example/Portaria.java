package org.example;

public class Portaria {
    private static Portaria instancia = new Portaria();

    private Portaria() {}

    public static Portaria getInstancia() {
        return instancia;
    }

    public String solicitarReparoManutencao(String mensagem) {
        return "A Portaria recebeu sua solicitação.\n" +
                "A Manutenção respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Manutencao.getInstancia().solicitarReparo(mensagem);
    }

    public String reportarIncidenteManutencao(String mensagem) {
        return "A Portaria recebeu sua solicitação.\n" +
                "A Manutenção respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Manutencao.getInstancia().reportarIncidente(mensagem);
    }

    public String solicitarInformacaoManutencao(String mensagem) {
        return "A Portaria recebeu sua solicitação.\n" +
                "A Manutenção respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Manutencao.getInstancia().solicitarInformacao(mensagem);
    }
}
