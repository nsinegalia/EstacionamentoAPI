package estacionamento.utilitario;

import estacionamento.negocio.Movimentacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static boolean validarPadraoPlaca(String placa){

        String padrao = "[A_Z][A_Z][A_Z]-\\d\\d\\d\\d";
        Pattern p = Pattern.compile(padrao);
        Matcher m = p.matcher(placa);

        return m.matches();

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
