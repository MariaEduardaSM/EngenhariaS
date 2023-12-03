package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuEstabelecimento extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuEstabelecimento frame = new MenuEstabelecimento();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MenuEstabelecimento() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnMeuCardapio = new JButton("Meu Cardápio");
        btnMeuCardapio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirTelaMeuCardapio();
            }
        });
        btnMeuCardapio.setBounds(150, 50, 150, 25);
        contentPane.add(btnMeuCardapio);

        JButton btnCriarCardapio = new JButton("Criar Cardápio");
        btnCriarCardapio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirTelaCriarCardapio();
            }
        });
        btnCriarCardapio.setBounds(150, 100, 150, 25);
        contentPane.add(btnCriarCardapio);

        JButton btnMeusPedidos = new JButton("Meus Pedidos");
        btnMeusPedidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirTelaMeusPedidos();
            }
        });
        btnMeusPedidos.setBounds(150, 150, 150, 25);
        contentPane.add(btnMeusPedidos);
    }

    private void abrirTelaMeuCardapio() {
        // Implemente conforme a necessidade
    }

    private void abrirTelaCriarCardapio() {
        // Implemente conforme a necessidade
    }

    private void abrirTelaMeusPedidos() {
        // Implemente conforme a necessidade
    }
}