package estacionamento.negocio;

import estacionamento.controle.EstacionamentoController;

/**
 * Essa classe representa as informações relativas à vagas do estacionamento ou status de ocupação
 */
public class Vaga {

    public static int totalVagas = 100;
    private static int vagasOcupadas = inicializarOcupadas();

    private Vaga() {
    }

    /**
     * Verificar a existencia de alguma vaga livre no estacionamento
     *
     * @return true se houver alguma vaga e false se estiver cheio
     */
    public static boolean temVagaLivre() {

        return (vagasOcupadas < TOTAL_VAGAS);
    }

    /**
     * Esse metodo vai buscar o status atual das vagas do estacionamento.
     */
    public static int inicializarOcupadas() {
        EstacionamentoController controle = new EstacionamentoController();
        return controle.inicializarOcupadas();
    }

    /**
     * Retorna o número de vagas ocupadas
     *
     * @return numero total de vagas ocupadas num determinado instante.
     */
    public static int ocupadas() {
        return Vaga.vagasOcupadas;
    }

    /**
     * Metodo para retornar o numero de vagas livres.
     *
     * @return numero total de vagas livres num determinado instante.
     */
    public static int livres() {
        return totalVagas - Vaga.vagasOcupadas;
    }


    /**
     * Esse metodo atualiza o numero de vagas ocupadas após a entrada do veículo
     */
    public static void entrou() {
        Vaga.vagasOcupadas++;
    }


}
