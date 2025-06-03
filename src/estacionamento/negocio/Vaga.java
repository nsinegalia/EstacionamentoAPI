package estacionamento.negocio;

/**
 * Essa classe representa as informações relativas à vagas do estacionamento ou status de ocupação
 */
public class Vaga {

    public static int totalVagas = 100;
    private static int vagasOcupadas = 0;

    private Vaga() {
    }

    /**
     * Verificar a existencia de alguma vaga livre no estacionamento
     *
     * @return true se houver alguma vaga e false se estiver cheio
     */
    public static boolean temVagaLivre() {
        //TODO Implementar metodo.
        return false;
    }

    /**
     * Esse metodo vai buscar o status atual das vagas do estacionamento.
     */
    public static void inicializarOcupadas() {
        //TODO Implementar
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
