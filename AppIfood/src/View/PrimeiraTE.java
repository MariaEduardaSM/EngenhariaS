

package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.Estabelecimento;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class PrimeiraTE extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
	private List<Estabelecimento> listaEstabelecimento;
    private static List<Usuario> listaUsuarios;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PrimeiraTela frame = new PrimeiraTela(listaUsuarios);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PrimeiraTE(List<Estabelecimento> listaEstabelecimento) {
        this.listaEstabelecimento = listaEstabelecimento;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setBounds(140, 159, 114, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton_1 = new JButton("CADASTRAR");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirTelaCadastro();
            }
        });
        btnNewButton_1.setBounds(140, 313, 117, 25);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton = new JButton("ENTRAR");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = textField.getText();
                String senha = new String(passwordField.getPassword());

                if (validarLogin(email, senha)) {
                    abrirTelaMenu();
                } else {
                    showMessage("Usuário não encontrado. Verifique seu cnpj e senha.");
                }
            }
        });
        btnNewButton.setBounds(140, 276, 117, 25);
        contentPane.add(btnNewButton);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 217, 117, 19);
        contentPane.add(passwordField);

        JLabel lblLogin = new JLabel("LOGIN");
        lblLogin.setFont(new Font("Chandas", Font.PLAIN, 30));
        lblLogin.setForeground(Color.WHITE);
        lblLogin.setBounds(140, 33, 117, 108);
        contentPane.add(lblLogin);

        JLabel lblSenha = new JLabel("SENHA");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setBounds(140, 176, 70, 45);
        contentPane.add(lblSenha);

        JLabel lblEmail = new JLabel("CNPJ");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setBounds(140, 132, 70, 15);
        contentPane.add(lblEmail);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(PrimeiraTela.class.getResource("/ViewImagens/Painel.png")));
        lblNewLabel_1.setBounds(78, 33, 237, 317);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(-262, -66, 863, 816);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setIcon(new ImageIcon(PrimeiraTela.class.getResource("/ViewImagens/fundo.png")));
        contentPane.add(lblNewLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 453);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private boolean validarLogin(String email, String senha) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email) && new String(usuario.getSenha()).equals(senha)) {
                return true;
            }
        }
        return false;
    }

    private void abrirTelaCadastro() {
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        dispose();     }

    private void abrirTelaMenu() {
      
        new Menu().setVisible(true);
        dispose();
    }

    private void showMessage(String message) {
       
        System.out.println(message);
    }
}