package atividade1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class ExemploBorderLayout extends JFrame {
	
	private JPanel contentPane;
	
	
	public ExemploBorderLayout()
	{
		JButton[] vetBotoes = {new JButton("Norte"), new JButton("Sul"), new JButton("Leste"), new JButton("Oeste"), new JButton("Centro")};
		
		setBounds(0, 0, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane= new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		contentPane.add(vetBotoes[0], BorderLayout.NORTH);
		contentPane.add(vetBotoes[1], BorderLayout.SOUTH);
		contentPane.add(vetBotoes[2], BorderLayout.EAST);
		contentPane.add(vetBotoes[3], BorderLayout.WEST);
		contentPane.add(vetBotoes[4], BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		ExemploBorderLayout bord = new ExemploBorderLayout();
		bord.setVisible(true);
	}

}
