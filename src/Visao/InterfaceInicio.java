package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modeloEntidade.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;



import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

public class InterfaceInicio extends JFrame implements ActionListener{ 
	private static final int TAMANHO_HORIZONTAL = 800;
	private static final int TAMANHO_VETICAL = 510;
	private JFrame frame;
	private ImageIcon imagemInicio = new ImageIcon();
	
	public InterfaceInicio(Usuario usuario){
		Inicializar(usuario);
	}
	
	private void Inicializar(Usuario usuario){
		frame = new JFrame("Olá "+usuario.getNome()+ " Bem Vindo ao Justice League Card Game");
		frame.setBounds(100,100,TAMANHO_HORIZONTAL,TAMANHO_VETICAL);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		frame.add(panel);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 76, TAMANHO_HORIZONTAL, TAMANHO_VETICAL);
		panel.add(panel1);
		
		JLabel label = new JLabel("");
		imagemInicio = getImage("/images/inicio.jpg");
		label.setIcon(imagemInicio);
		label.setBounds(0, 76, 823, 415);
		panel1.add(label);
		
		JButton btnEscolherEqp = new JButton("Escolher Equipes");
		btnEscolherEqp.setBounds(10, 21, 125, 47);
		panel.add(btnEscolherEqp);
		btnEscolherEqp.addActionListener(this);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(145, 21, 125, 47);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
	}
	public ImageIcon getImage(String url) {
		ImageIcon im = new  ImageIcon(InterfaceInicio.class.getResource(url));
		return im;
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		String btnName = action.getActionCommand();
		switch (btnName) {
		case "Escolher Equipes":
			this.setEnabled(false);
			new InterfaceCriarEquipe();
			
		}
	}
}

