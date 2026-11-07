import org.example.Morador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoradorTest {

    @Test
    void deveSolicitarReparoManutencao() {
        Morador morador = new Morador();
        assertEquals("A Portaria recebeu sua solicitação.\nA Manutenção respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe de Manutenção agendou o reparo para: Vazamento na torneira",
                morador.solicitarReparoManutencao("Vazamento na torneira"));
    }

    @Test
    void deveReportarIncidenteManutencao() {
        Morador morador = new Morador();
        assertEquals("A Portaria recebeu sua solicitação.\nA Manutenção respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe de Manutenção isolou a área devido ao incidente: Vidro quebrado no hall",
                morador.reportarIncidenteManutencao("Vidro quebrado no hall"));
    }

    @Test
    void deveSolicitarInformacaoManutencao() {
        Morador morador = new Morador();
        assertEquals("A Portaria recebeu sua solicitação.\nA Manutenção respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe de Manutenção enviou os detalhes sobre: Cronograma de dedetização",
                morador.solicitarInformacaoManutencao("Cronograma de dedetização"));
    }

}