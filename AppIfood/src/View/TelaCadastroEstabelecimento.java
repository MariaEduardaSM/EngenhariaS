package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

// Classe para representar os dados do estabelecimento
class Estabelecimento {
    private String nomeEstabelecimento;
    private String cnpj;
    private String endereco;
    private String tipo;
    private String telefone;
    private String nomeProprietario;
    private String cpfProprietario;
    private String email;
    private String senha;

    // Construtor
    public Estabelecimento(String nomeEstabelecimento, String cnpj, String endereco, String tipo, String telefone,
            String nomeProprietario, String cpfProprietario, String email, String senha) {
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.tipo = tipo;
        this.telefone = telefone;
        this.nomeProprietario = nomeProprietario;
        this.cpfProprietario = cpfProprietario;
        this.email = email;
        this.senha = senha;
    }

    // Getters e setters (opcional)

    @Override
    public String toString() {
        return "Estabelecimento [nomeEstabelecimento=" + nomeEstabelecimento + ", cnpj=" + cnpj + ", endereco="
                + endereco + ", tipo=" + tipo + ", telefone=" + telefone + ", nomeProprietario=" + nomeProprietario
                + ", cpfProprietario=" + cpfProprietario + ", email=" + email + ", senha=" + senha + "]";
    }
}

public class TelaCadastroEstabelecimento extends JFrame {

    private static List<Estabelecimento> listaEstabelecimentos = new ArrayList<>();

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldNomeEstabelecimento;
    private JTextField textFieldCnpj;
    private JTextField textFieldEndereco;
    private JTextField textFieldTipo;
    private JTextField textFieldTelefone;
    private JTextField textFieldNomeProprietario;
    private JTextField textFieldCpfProprietario;
    private JTextField textFieldEmail;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastroEstabelecimento frame = new TelaCadastroEstabelecimento();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    Object estabelecimento = null;
					listaEstabelecimentos.add((Estabelecimento) estabelecimento);

                    // Redireciona para a PrimeiraTE
                    PrimeiraTE primeiraTE = new PrimeiraTE(null);
                    primeiraTE.setVisible(true);
               
                }
            }
        });
    }

    public TelaCadastroEstabelecimento() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCadastroEstabelecimento = new JLabel("CADASTRO DE ESTABELECIMENTO");
        lblCadastroEstabelecimento.setFont(new Font("Dialog", Font.BOLD, 14));
        lblCadastroEstabelecimento.setBounds(80, 12, 300, 15);
        contentPane.add(lblCadastroEstabelecimento);

        JLabel lblNomeEstabelecimento = new JLabel("Nome do Estabelecimento:");
        lblNomeEstabelecimento.setForeground(Color.BLACK);
        lblNomeEstabelecimento.setBounds(12, 50, 200, 15);
        contentPane.add(lblNomeEstabelecimento);

        JLabel lblCnpj = new JLabel("CNPJ:");
        lblCnpj.setForeground(Color.BLACK);
        lblCnpj.setBounds(132, 77, 70, 15);
        contentPane.add(lblCnpj);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setForeground(Color.BLACK);
        lblEndereco.setBounds(111, 110, 150, 15);
        contentPane.add(lblEndereco);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setForeground(Color.BLACK);
        lblTipo.setBounds(132, 140, 70, 15);
        contentPane.add(lblTipo);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setForeground(Color.BLACK);
        lblTelefone.setBounds(120, 173, 70, 15);
        contentPane.add(lblTelefone);

        JLabel lblNomeProprietario = new JLabel("Nome do Proprietário:");
        lblNomeProprietario.setForeground(Color.BLACK);
        lblNomeProprietario.setBounds(53, 200, 178, 15);
        contentPane.add(lblNomeProprietario);

        JLabel lblCpfProprietario = new JLabel("CPF do Proprietário:");
        lblCpfProprietario.setForeground(Color.BLACK);
        lblCpfProprietario.setBounds(62, 227, 150, 15);
        contentPane.add(lblCpfProprietario);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.BLACK);
        lblEmail.setBounds(142, 260, 70, 15);
        contentPane.add(lblEmail);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setForeground(Color.BLACK);
        lblSenha.setBounds(142, 290, 70, 15);
        contentPane.add(lblSenha);

        textFieldNomeEstabelecimento = new JTextField();
        textFieldNomeEstabelecimento.setBounds(220, 48, 150, 19);
        contentPane.add(textFieldNomeEstabelecimento);
        textFieldNomeEstabelecimento.setColumns(10);

        textFieldCnpj = new JTextField();
        textFieldCnpj.setColumns(10);
        textFieldCnpj.setBounds(220, 78, 150, 19);
        contentPane.add(textFieldCnpj);

        textFieldEndereco = new JTextField();
        textFieldEndereco.setColumns(10);
        textFieldEndereco.setBounds(220, 108, 150, 19);
        contentPane.add(textFieldEndereco);

        textFieldTipo = new JTextField();
        textFieldTipo.setColumns(10);
        textFieldTipo.setBounds(220, 138, 150, 19);
        contentPane.add(textFieldTipo);

        textFieldTelefone = new JTextField();
        textFieldTelefone.setColumns(10);
        textFieldTelefone.setBounds(220, 168, 150, 19);
        contentPane.add(textFieldTelefone);

        textFieldNomeProprietario = new JTextField();
        textFieldNomeProprietario.setColumns(10);
        textFieldNomeProprietario.setBounds(220, 198, 150, 19);
        contentPane.add(textFieldNomeProprietario);

        textFieldCpfProprietario = new JTextField();
        textFieldCpfProprietario.setColumns(10);
        textFieldCpfProprietario.setBounds(220, 228, 150, 19);
        contentPane.add(textFieldCpfProprietario);

        textFieldEmail = new JTextField();
        textFieldEmail.setColumns(10);
        textFieldEmail.setBounds(220, 258, 150, 19);
        contentPane.add(textFieldEmail);

        passwordField = new JPasswordField();
        passwordField.setBounds(220, 288, 150, 19);
        contentPane.add(passwordField);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (camposPreenchidos()) {
                    cadastrarEstabelecimento();
                    showMessage("Estabelecimento cadastrado com sucesso!");
                } else {
                    showMessage("Preencha todos os campos antes de cadastrar!");
                }
            }

            private void showMessage(String message) {
                JOptionPane.showMessageDialog(null, message);
            }

            private void cadastrarEstabelecimento() {
                // Obtém os dados preenchidos
                String nomeEstabelecimento = textFieldNomeEstabelecimento.getText();
                String cnpj = textFieldCnpj.getText();
                String endereco = textFieldEndereco.getText();
                String tipo = textFieldTipo.getText();
                String telefone = textFieldTelefone.getText();
                String nomeProprietario = textFieldNomeProprietario.getText();
                String cpfProprietario = textFieldCpfProprietario.getText();
                String email = textFieldEmail.getText();
                String senha = new String(passwordField.getPassword());

                // Cria um objeto Estabelecimento
                Estabelecimento estabelecimento = new Estabelecimento(nomeEstabelecimento, cnpj, endereco, tipo,
                        telefone, nomeProprietario, cpfProprietario, email, senha);

                // Adiciona o objeto à lista
                listaEstabelecimentos.add(estabelecimento);
            }
        });
        btnCadastrar.setBounds(160, 330, 117, 25);
        contentPane.add(btnCadastrar);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                voltarParaTelaCadastro();
            }
        });
        btnVoltar.setBounds(280, 330, 117, 25);
        contentPane.add(btnVoltar);

        JLabel label = new JLabel("");
        label.setBounds(-13, -66, 814, 574);
        label.setIcon(new ImageIcon(TelaCadastroEstabelecimento.class.getResource("/ViewImagens/fundomenu.jpeg")));
        contentPane.add(label);
    }

    private boolean camposPreenchidos() {
        return !textFieldNomeEstabelecimento.getText().isEmpty() && !textFieldCnpj.getText().isEmpty()
                && !textFieldEndereco.getText().isEmpty() && !textFieldTipo.getText().isEmpty()
                && !textFieldTelefone.getText().isEmpty() && !textFieldNomeProprietario.getText().isEmpty()
                && !textFieldCpfProprietario.getText().isEmpty() && !textFieldEmail.getText().isEmpty()
                && passwordField.getPassword().length > 0;
    }

    private void voltarParaTelaCadastro() {
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        dispose();
    }
}
