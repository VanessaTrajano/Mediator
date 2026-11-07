package org.example;

public class PessoaCondominio {
    public String solicitarReparoManutencao(String mensagem) {
        return Portaria.getInstancia().solicitarReparoManutencao(mensagem);
    }

    public String reportarIncidenteManutencao(String mensagem) {
        return Portaria.getInstancia().reportarIncidenteManutencao(mensagem);
    }

    public String solicitarInformacaoManutencao(String mensagem) {
        return Portaria.getInstancia().solicitarInformacaoManutencao(mensagem);
    }
}
