package View;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRestaurante extends JFrame {

    private static final long serialVersionUID = 1L;
    private TelaCarrinho telaCarrinho;
    private JTable table; // Adicionando uma referência à tabela

    public TelaRestaurante(TelaCarrinho telaCarrinho) {
        this.telaCarrinho = telaCarrinho;

        setTitle("Cardápio");
        setSize(794, 686);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);

        String[] colunas = {"Item", "Descrição", "Preço", "Ação"};
        Object[][] dados = {
                {"X-tudo", "pão,carne,bacon,ovo,presunto,batata,salsicha", 23.00, "Adicionar"},
                {"X-salada", "Pão,carne,alface,tomate", 16.00, "Adicionar"},
                {"X-bacon", "Pão,carne,bacon,", 18.00, "Adicionar"}
        };

        DefaultTableModel model = new DefaultTableModel(dados, colunas) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 3) {
                    return JButton.class;
                }
                return super.getColumnClass(columnIndex);
            }
        };

        table = new JTable(model);
        table.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());
        table.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JCheckBox()));
        table.getColumnModel().addColumnModelListener(new ButtonColumnListener(table));

        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane);

        JButton btnCarrinho = new JButton("Carrinho");
        btnCarrinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaCarrinho();
            }
        });
        contentPane.add(btnCarrinho);

        JButton btnVoltar = new JButton("Voltar");
        contentPane.add(btnVoltar);
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                voltarParaMenu();
            }
        });
    }

    private void abrirTelaCarrinho() {
        telaCarrinho.setVisible(true);
    }

    private void voltarParaMenu() {
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }

    private class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText("Adicionar");
            return this;
        }
    }

    private class ButtonEditor extends DefaultCellEditor {
        private JButton button;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> fireEditingStopped());
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setText("Adicionar");
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return "Adicionar";
        }
    }

    private class ButtonColumnListener implements TableColumnModelListener {

        private final JTable table;

        public ButtonColumnListener(JTable table) {
            this.table = table;
        }

        @Override
        public void columnAdded(TableColumnModelEvent e) {
           
        }

        @Override
        public void columnRemoved(TableColumnModelEvent e) {
                    }

        @Override
        public void columnMoved(TableColumnModelEvent e) {
          
        }

        @Override
        public void columnMarginChanged(ChangeEvent e) {
            
        }

        @Override
        public void columnSelectionChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting() && table.getSelectedColumn() == 3) {
                int row = table.getSelectedRow();
                adicionarAoCarrinho(row);
            }
        }
    }

    private void adicionarAoCarrinho(int row) {
       
        String nomeItem = (String) table.getValueAt(row, 0);
        String descricao = (String) table.getValueAt(row, 1);
        double preco = (double) table.getValueAt(row, 2);

        telaCarrinho.adicionarItem();
        JOptionPane.showMessageDialog(this, "Item adicionado ao carrinho!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaCarrinho telaCarrinho = new TelaCarrinho();
            TelaRestaurante telaRestaurante = new TelaRestaurante(telaCarrinho);
            telaRestaurante.setVisible(true);
        });
    }
}
