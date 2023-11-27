package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCadastro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JPasswordField passwordField;
    private List<Usuario> listaUsuarios;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCadastro frame = new TelaCadastro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaCadastro() {
        listaUsuarios = new ArrayList<>(); // Inicializa a lista de usuários
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblC = new JLabel("CADASTRO");
        lblC.setBounds(175, 29, 110, 15);
        contentPane.add(lblC);

        JLabel lblEmail_2 = new JLabel("EMAIL");
        lblEmail_2.setBounds(99, 114, 70, 15);
        contentPane.add(lblEmail_2);

        JLabel lblCpf = new JLabel("CPF");
        lblCpf.setBounds(99, 79, 70, 15);
        contentPane.add(lblCpf);

        JLabel lblNome = new JLabel("NOME");
        lblNome.setBounds(99, 52, 70, 15);
        contentPane.add(lblNome);

        JLabel lblEmail_2_1 = new JLabel("END");
        lblEmail_2_1.setBounds(99, 147, 70, 15);
        contentPane.add(lblEmail_2_1);

        JLabel lblEmail_2_1_2 = new JLabel("SENHA");
        lblEmail_2_1_2.setBounds(99, 174, 70, 15);
        contentPane.add(lblEmail_2_1_2);

        passwordField = new JPasswordField();
        passwordField.setBounds(171, 172, 114, 19);
        contentPane.add(passwordField);

        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (camposPreenchidos()) {
                    cadastrarUsuario();
                    showMessage("Usuário cadastrado com sucesso!");
                    abrirPrimeiraTela();
                } else {
                    showMessage("Preencha todos os campos antes de cadastrar!");
                }
            }

            private void showMessage(String string) {
                JOptionPane.showMessageDialog(contentPane, string);
            }
            private boolean camposPreenchidos() {
                return !textField.getText().isEmpty() && !textField_1.getText().isEmpty()
                        && !textField_2.getText().isEmpty() && !textField_3.getText().isEmpty()
                        && passwordField.getPassword().length > 0;
            }
        });
        btnOk.setBounds(168, 203, 117, 25);
        contentPane.add(btnOk);

        textField_3 = new JTextField();
        textField_3.setBounds(171, 143, 114, 19);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(171, 112, 114, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(171, 77, 114, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField = new JTextField();
        textField.setBounds(170, 50, 114, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnCadastroEstabelecimento = new JButton("CadastroEstabelecimento");
        btnCadastroEstabelecimento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirTelaCadastroEstabelecimento();
            }
        });
        btnCadastroEstabelecimento.setBounds(99, 0, 236, 25);
        contentPane.add(btnCadastroEstabelecimento);

        JLabel label = new JLabel("");
        label.setBounds(-13, -92, 814, 574);
        contentPane.add(label);
    }

    private void abrirPrimeiraTela() {
        PrimeiraTela primeiraTela = new PrimeiraTela(listaUsuarios);
        primeiraTela.setVisible(true);
        dispose(); // Fecha a tela atual
    }

    private void abrirTelaCadastroEstabelecimento() {
        TelaCadastroEstabelecimento telaCadastroEstabelecimento = new TelaCadastroEstabelecimento();
        telaCadastroEstabelecimento.setVisible(true);
        dispose(); // Fecha a tela atual
    }

    private void cadastrarUsuario() {
        String nome = textField.getText();
        String cpf = textField_1.getText();
        String email = textField_2.getText();
        String endereco = textField_3.getText();
        char[] senha = passwordField.getPassword();
        Usuario usuario = new Usuario(nome, cpf, email, endereco, senha);
        listaUsuarios.add(usuario);
    }
}

class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private char[] senha;

    public Usuario(String nome, String cpf, String email, String endereco, char[] senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public char[] getSenha() {
        return senha;
    }
}
