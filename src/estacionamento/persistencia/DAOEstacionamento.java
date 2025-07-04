package estacionamento.persistencia;

import estacionamento.controle.EstacionamentoException;
import estacionamento.negocio.Movimentacao;
import estacionamento.negocio.Vaga;
import estacionamento.utilitario.EstacionamentoUtil;

import java.lang.management.MonitorInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class DAOEstacionamento {

    public void criar(Movimentacao movimentacao) throws EstacionamentoException {
        String cmd1 = EstacionamentoUtil.get("insertMov");
        String cmd2 = EstacionamentoUtil.get("atualizaVaga");

        Connection conexao = null;
        try {

            conexao = getConnection();
            conexao.setAutoCommit(false);

            PreparedStatement stmt = conexao.prepareStatement(cmd1);

            stmt.setString(1, movimentacao.getVeiculo().getPlaca());
            stmt.setString(2, movimentacao.getVeiculo().getMarca());
            stmt.setString(3, movimentacao.getVeiculo().getModelo());
            stmt.setString(4, movimentacao.getVeiculo().getCor());
            stmt.setString(5, EstacionamentoUtil.getDataAsString(movimentacao.getDataHoraEntrada()));

            stmt.execute();
            stmt = conexao.prepareStatement(cmd2);
            stmt.setInt(1, Vaga.ocupadas() + 1);
            stmt.execute();

            conexao.commit();
        } catch (SQLException e) {
            try {
                e.printStackTrace();
                conexao.rollback();
                throw new EstacionamentoException("Erro ao registrar veiculo.");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void atualizar(Movimentacao movimentacao) {
        //TODO Implementar
    }

    public Movimentacao buscarMovimentacaoAberta(String placa) {
        //TODO Implementar
        return null;

    }

    public List<Movimentacao> consultarMovimentacoes(LocalDateTime data) {
        //TODO Implementar
        return null;

    }

    public static Connection getConnection() throws SQLException {

        String url = EstacionamentoUtil.get("url");
        String usuario = EstacionamentoUtil.get("usuario");
        String senha = EstacionamentoUtil.get("senha");

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        return conexao;

    }

    public static void closeConnection(Connection conexao) {

        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public int getOcupadas() {

        int ocupadas = 0;
        Connection conexao = null;
        String cmd = EstacionamentoUtil.get("consultarOcupadas");
        try {
            conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(cmd);

           ResultSet resultado = ps.executeQuery();
           if(resultado.next()){
               ocupadas = resultado.getInt("ocupadas");
           }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(conexao);
        }
        return ocupadas;
    }
}
