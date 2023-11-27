package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Compras.Carrinho;
import ParceirosIfood.Item;

public class TelaCarrinho extends JFrame {

    private Carrinho carrinho;
    private DefaultListModel<String> listaItens;
    private JList<String> jList;
    private JButton btnAdicionar;
    private JButton btnRemover;

    public TelaCarrinho() {
        setTitle("Carrinho de Compras");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        carrinho = new Carrinho();

        listaItens = new DefaultListModel<>();
        jList = new JList<>(listaItens);
        JScrollPane scrollPane = new JScrollPane(jList);
        add(scrollPane);

        btnAdicionar = new JButton("Adicionar Item");
        btnRemover = new JButton("Remover Item");

        JPanel panelBotoes = new JPanel();
        panelBotoes.add(btnAdicionar);
        panelBotoes.add(btnRemover);
        add(panelBotoes, "South");

        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarItem();
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerItem();
            }
        });
    }

    void adicionarItem() {
        String nomeItem = JOptionPane.showInputDialog("Digite o nome do item:");
        if (nomeItem != null && !nomeItem.isEmpty()) {
           
            String[] descricao = {"Descrição do item"}; 
            double preco = 10.0; // Substitua com o preço real
            Item novoItem = new Item(nomeItem, descricao, preco);
            carrinho.adicionarItem(novoItem);
            atualizarLista();
        }
    }

    private void removerItem() {
        int indiceSelecionado = jList.getSelectedIndex();
        if (indiceSelecionado != -1) {
            carrinho.removerItem(carrinho.getItens().get(indiceSelecionado));
            atualizarLista();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item para remover.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarLista() {
        listaItens.clear();
        ArrayList<Item> itens = carrinho.getItens();
        for (Item item : itens) {
            listaItens.addElement(item.getNome());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaCarrinho telaCarrinho = new TelaCarrinho();
                telaCarrinho.setVisible(true);
            }
        });
    }
}
