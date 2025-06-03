package estacionamento.utilitario;

import estacionamento.negocio.Movimentacao;

/**
 * Essa classe representa uma classe de apoio às demais do sistema.
 *
 */

public class EstacionamentoUtil {


    /**
     * Esse metodo valida a placa com o padrao nacional LLL-1111
     *
     * @param placa
     * @return true se atender o padrão e false se não
     */
    public boolean validarPadraoPlaca(String placa){
        //TODO Implementar
        return false;

    }

    /**
     * Esse metodo vai fazer o calculo do valor da estada do veiculo baseado no tarifario e na hora de entrada e saida do veiculo
     * e ele altera a propria instancia do parametro.
     *
     * @param movimentacao
     */

    public void calcularPagamento (Movimentacao movimentacao){
        //TODO Implementar


    }


}
