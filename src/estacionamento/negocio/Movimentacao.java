package estacionamento.negocio;

import java.time.LocalDateTime;

/**
 * Essa classe representa o fluxo do veículo dentro do estacionamento, ele contem as informações de entrada e saída do veículo e o valor pago na estada.
 *
 */

public class Movimentacao {

    private Veiculo veiculo;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private double valor;

}
