package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import controle.ControlarEquipeUsuario;
import controle.ControlarUsuario;
import modeloEntidade.Usuario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceBoasVindas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceBoasVindas frame = new InterfaceBoasVindas();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceBoasVindas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 258);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(51, 32, 318, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Para come\u00E7ar, nos diga seu nome");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 17));
		lblNewLabel.setBounds(33, 11, 252, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(71, 78, 275, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 0, 255, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnComece = new JButton("Comece !");
		btnComece.setForeground(new Color(0, 0, 0));
		btnComece.setBounds(152, 129, 112, 40);
		contentPane.add(btnComece);
		btnComece.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String btn = arg0.getActionCommand();
		String nome;
		switch (btn) {
		case "Comece !":
			nome = textField.getText();
			ControlarUsuario user = new ControlarUsuario();
			Usuario usuario = new Usuario();
			usuario = user.cadastrarUsuario(nome);
			this.setEnabled(false);
			new InterfaceInicio(usuario);
			break;
		}		
		
	}
}
