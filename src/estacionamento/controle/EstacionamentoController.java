package estacionamento.controle;

import estacionamento.negocio.Movimentacao;
import estacionamento.negocio.Vaga;
import estacionamento.negocio.Veiculo;
import estacionamento.persistencia.DAOEstacionamento;
import estacionamento.utilitario.EstacionamentoUtil;

import java.time.LocalDateTime;
import java.util.List;

public class EstacionamentoController {

    public void processarEntrada(String placa, String marca, String modelo, String cor)
            throws EstacionamentoException, VeiculoException {
        //TODO Implementar
        if(!Vaga.temVagaLivre()){
            throw new EstacionamentoException("Estacionamento lotado!");
        }

        if(!EstacionamentoUtil.validarPadraoPlaca(placa)){
            throw new VeiculoException("Placa informada invalida!");
        }

        Veiculo veiculo = new Veiculo(placa, marca, modelo, cor);

        Movimentacao movimentacao = new Movimentacao(veiculo, LocalDateTime.now());

        DAOEstacionamento daoEstacionamento = new DAOEstacionamento();
        daoEstacionamento.criar(movimentacao);

        Vaga.entrou();

    }

    public Movimentacao processarSaida(String placa){
        //TODO Implementar
        return null;
    }

    public List<Movimentacao> emitirRelatorio (LocalDateTime data){
        //TODO Implementar
        return null;
    }

    public int inicializarOcupadas() {

        DAOEstacionamento dao = new DAOEstacionamento();
        return dao.getOcupadas();

    }
}
