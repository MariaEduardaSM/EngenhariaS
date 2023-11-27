package View;

import Compras.Carrinho;
import ParceirosIfood.Item;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TelaPedidoFinalizado extends JFrame {

    private static final long serialVersionUID = 1L;

    public TelaPedidoFinalizado(Carrinho carrinho) {
        setTitle("Pedido Finalizado");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        // Exibir itens no carrinho
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Calcular e exibir o valor final
        double valorFinal = calcularValorFinal(carrinho);
        JLabel lblValorFinal = new JLabel("Valor final do pedido: R$" + valorFinal);
        contentPane.add(lblValorFinal, BorderLayout.SOUTH);

        // Preencher a área de texto com os itens escolhidos
        ArrayList<Item> itensEscolhidos = carrinho.getItens();
        for (Item item : itensEscolhidos) {
            textArea.append("- " + item.getNome() + " - R$" + item.getPreco() + "\n");
        }

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> {
            // Adicione a lógica necessária para fechar a interface ou realizar ações adicionais
            dispose(); // Fecha a tela atual
        });
        contentPane.add(btnFechar, BorderLayout.NORTH);
    }

    private double calcularValorFinal(Carrinho carrinho) {
        double valorFinal = 0.0;

        for (Item item : carrinho.getItens()) {
            valorFinal += item.getPreco();
        }

        return valorFinal;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Exemplo de uso da TelaPedidoFinalizado
            Carrinho carrinho = new Carrinho();
            Item item1 = new Item("X-tudo", new String[]{"pão", "carne", "bacon", "ovo", "presunto", "batata", "salsicha"}, 23.00);
            Item item2 = new Item("X-salada", new String[]{"Pão", "carne", "alface", "tomate"}, 16.00);

            carrinho.adicionarItem(item1);
            carrinho.adicionarItem(item2);

            TelaPedidoFinalizado telaPedidoFinalizado = new TelaPedidoFinalizado(carrinho);
            telaPedidoFinalizado.setVisible(true);
        });
    }
}
