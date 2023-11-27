package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

    private static final long serialVersionUID = 1L;

    public Menu() {
        setTitle("Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextField textFieldBusca = new JTextField();
        textFieldBusca.setBounds(139, 18, 150, 20);
        contentPane.add(textFieldBusca);

        JLabel lblBuscar = new JLabel("Buscar Estabelecimento:");
        lblBuscar.setFont(new Font("Dialog", Font.BOLD, 9));
        lblBuscar.setBounds(12, 19, 150, 20);
        contentPane.add(lblBuscar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Dialog", Font.BOLD, 10));
        btnBuscar.setBounds(301, 17, 80, 20);
        contentPane.add(btnBuscar);

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String busca = textFieldBusca.getText();
                if (busca.equals("Lanchonete Maximum")) {
                    abrirCardapio();
                } else {
                    showMessage("Estabelecimento não encontrado.");
                }
            }
        });

        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(Menu.class.getResource("/ViewImagens/fundomenu.jpeg")));
        label.setBounds(-12, 0, 393, 170);
        contentPane.add(label);
    }

    private void abrirCardapio() {
        new TelaRestaurante(null).setVisible(true);
    }

    private void showMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
}