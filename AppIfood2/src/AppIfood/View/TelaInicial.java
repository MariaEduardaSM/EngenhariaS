package AppIfood.View;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaInicial {

	private JFrame frame;
	private JPasswordField passwordField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(362, 165, 174, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(362, 268, 174, 19);
		frame.getContentPane().add(passwordField_1);

		JButton ButtonEntrar = new JButton("");
		ButtonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Login realizado com sucesso.");

			}
		});
		ButtonEntrar.setContentAreaFilled(false);
		ButtonEntrar.setBounds(372, 329, 110, 44);
		frame.getContentPane().add(ButtonEntrar);

		JButton ButtonCadastrar = new JButton("");
		ButtonCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		ButtonCadastrar.setContentAreaFilled(false);
		ButtonCadastrar.setBounds(337, 462, 174, 25);
		frame.getContentPane().add(ButtonCadastrar);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 806, 592);
		lblNewLabel_1.setIcon(new ImageIcon(TelaInicial.class.getResource("/AppIfood/photo/login.png")));
		frame.getContentPane().add(lblNewLabel_1);
	}
}
