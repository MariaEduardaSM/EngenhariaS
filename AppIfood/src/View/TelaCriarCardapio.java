package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCriarCardapio extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldNomePrato;
    private JTextField textFieldPreco;
    private JTextArea textAreaCardapio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaCriarCardapio frame = new TelaCriarCardapio();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaCriarCardapio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("CRIAR CARDÁPIO");
        lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNewLabel.setBounds(150, 12, 150, 15);
        contentPane.add(lblNewLabel);

        JLabel lblNomePrato = new JLabel("Nome do Prato:");
        lblNomePrato.setBounds(50, 50, 132, 15);
        contentPane.add(lblNomePrato);

        textFieldNomePrato = new JTextField();
        textFieldNomePrato.setBounds(172, 48, 150, 19);
        contentPane.add(textFieldNomePrato);
        textFieldNomePrato.setColumns(10);

        JLabel lblPreco = new JLabel("Preço:");
        lblPreco.setBounds(85, 80, 108, 15);
        contentPane.add(lblPreco);

        textFieldPreco = new JTextField();
        textFieldPreco.setBounds(134, 77, 150, 19);
        contentPane.add(textFieldPreco);
        textFieldPreco.setColumns(10);

        JButton btnAdicionar = new JButton("Adicionar ao Cardápio");
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarAoCardapio();
                
                
                
                JButton btnAdicionarMaisItens = new JButton("Adicionar Mais Itens");
                btnAdicionarMaisItens.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Limpar os campos para adicionar mais itens
                        limparCampos();
                    }

					private void limparCampos() {
						// TODO Auto-generated method stub
						
					}
                });
                btnAdicionarMaisItens.setBounds(255, 107, 180, 25);
                contentPane.add(btnAdicionarMaisItens);
            }
        });
        btnAdicionar.setBounds(85, 107, 215, 25);
        contentPane.add(btnAdicionar);
        
                JButton btnFinalizarCardapio = new JButton("Finalizar Cardápio");
                btnFinalizarCardapio.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        finalizarCardapio();
                    }
                });
                btnFinalizarCardapio.setBounds(134, 198, 180, 25);
                contentPane.add(btnFinalizarCardapio);

        textAreaCardapio = new JTextArea();
        textAreaCardapio.setEditable(false);
        textAreaCardapio.setBounds(50, 150, 350, 100);
        contentPane.add(textAreaCardapio);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(TelaCriarCardapio.class.getResource("/ViewImagens/fundomenu.jpeg")));
        lblNewLabel_1.setBounds(0, 0, 434, 261);
        contentPane.add(lblNewLabel_1);
    }

    private void adicionarAoCardapio() {
        String nomePrato = textFieldNomePrato.getText();
        String preco = textFieldPreco.getText();

        if (!nomePrato.isEmpty() && !preco.isEmpty()) {
            String novoItem = nomePrato + " - R$" + preco;
            textAreaCardapio.append(novoItem + "\n");
            textFieldNomePrato.setText("");
            textFieldPreco.setText("");
        }
    }

    private void finalizarCardapio() {
       
        showMessage("Cardápio criado!");
    }

    private void showMessage(String message) {
        System.out.println(message);
    }
    private void limparCampos() {
        textFieldNomePrato.setText("");
        textFieldPreco.setText("");
    }
}
