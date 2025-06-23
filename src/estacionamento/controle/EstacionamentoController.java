package estacionamento.controle;

import estacionamento.negocio.Movimentacao;
import estacionamento.negocio.Vaga;
import estacionamento.utilitario.EstacionamentoUtil;

import java.time.LocalDateTime;
import java.util.List;

public class EstacionamentoController {

    public void processarEntrada(String placa, String marca,
                                 String modelo, String cor) throws EstacionamentoException, VeiculoException {
        //TODO Implementar
        if(!Vaga.temVagaLivre()){
            throw new EstacionamentoException("Estacionamento lotado!");
        }

        if(!EstacionamentoUtil.validarPadraoPlaca(placa)){
            throw new VeiculoException("Placa informada invalida!");
        }



    }

    public Movimentacao processarSaida(String placa){
        //TODO Implementar
        return null;
    }

    public List<Movimentacao> emitirRelatorio (LocalDateTime data){
        //TODO Implementar
        return null;
    }

}
