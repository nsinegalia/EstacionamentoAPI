package estacionamento.apresentacao;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    private JPasswordField txtSenha;

    public static void main(String [] args){
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);

    }

    public TelaLogin(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 150));
        setResizable(false);
        setTitle("Login");

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH);

        JButton btnOk = new JButton("OK");
        panel.add(btnOk);

        JPanel panel_1 = new JPanel();
        getContentPane().add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(new BorderLayout(0, 0));

        JPanel panel_2 = new JPanel();
        panel_1.add(panel_2, BorderLayout.SOUTH);

        JLabel lblSenha = new JLabel("Senha");
        panel_2.add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setColumns(20);
        panel_2.add(txtSenha);

        JPanel panel_3 = new JPanel();
        panel_1.add(panel_3, BorderLayout.CENTER);

        JRadioButton rdbOperacional = new JRadioButton("Operacional");
        rdbOperacional.setSelected(true);
        panel_3.add(rdbOperacional);

        JRadioButton rdbRelatorio = new JRadioButton("Relat\u00F3rio");
        panel_3.add(rdbRelatorio);

        setLocationRelativeTo(null);

    }


}
