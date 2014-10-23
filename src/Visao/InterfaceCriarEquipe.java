package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JToolBar;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTable;

import modeloEntidade.Personagem;
import controle.ControlarEquipeUsuario;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.table.DefaultTableModel;



public class InterfaceCriarEquipe extends JFrame implements ActionListener {


	
	private JFrame frame;
	private JPanel panelBotoes;
	private JPanel panelFoto;
	private JLabel lblFoto;
	private JPanel panel;
	private JButton btnAdicionar;
	private JTable table;
	JComboBox comboBox;
	private List<Personagem> equipeUser = new ArrayList<Personagem>();
	
	public InterfaceCriarEquipe(){
		inicializar();
	}
	
	private void inicializar() {
		
		frame = new JFrame("Selecionar Personagens");
		frame.setBounds(100,100,800,550);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panelBotoes = new JPanel();
		panelBotoes.setBounds(0, 0, 130, 521);
		frame.getContentPane().add(panelBotoes);
		panelBotoes.setLayout(null);
		
		comboBox = new JComboBox<>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String url;
				ImageIcon heroiImg;
				if(comboBox.getSelectedIndex()== 1){
					url = "/images/AquamanEditado.jpg";
					heroiImg = getImage(url);
					lblFoto.setIcon(heroiImg);			
				}	
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "Aquaman", "Batman"}));
		comboBox.setBounds(10, 93, 110, 33);
		panelBotoes.add(comboBox);
		
		panelFoto = new JPanel();
		panelFoto.setBounds(158, 48, 300, 400);
		frame.getContentPane().add(panelFoto);
		
		lblFoto = new JLabel("");
		panelFoto.add(lblFoto);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(158, 11, 300, 31);
		frame.getContentPane().add(panelTitulo);
		
		JLabel lblTitulo = new JLabel("Personagem");
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		panelTitulo.add(lblTitulo);
		
		panel = new JPanel();
		panel.setBounds(158, 459, 300, 38);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(0, 0, 300, 38);
		panel.add(btnAdicionar);
		btnAdicionar.addActionListener(this);
		
		
		
		JButton btnAdd = new JButton("New button");
		btnAdd.setBounds(123, 415, 300, 400);
		
	}
	


	public ImageIcon getImage(String url) {
		ImageIcon imgPersonagem = new ImageIcon(InterfaceCriarEquipe.class.getResource(url));
		return imgPersonagem;
	}
	
	@Override
	public void actionPerformed(ActionEvent action) {
		String btnName  = action.getActionCommand();
		String url;
		String nome = "";
		ImageIcon heroiImg = new ImageIcon();

		switch (btnName) {
		case "Adicionar":
			ControlarEquipeUsuario equipe = new ControlarEquipeUsuario();
			equipeUser = equipe.addPersonagem((String) comboBox.getSelectedItem());
			System.out.println("equipe "+ equipeUser);
			break;
		}
	}
}
