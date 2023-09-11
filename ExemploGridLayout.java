package atividade1;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ExemploGridLayout extends JFrame {

	private JPanel contentPane;

	public ExemploGridLayout() {

		JButton[] vetBotoes = { new JButton("Norte"), new JButton("Sul"), new JButton("Leste"), new JButton("Oeste"),
				new JButton("Centro") };

		setBounds(0, 0, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));

		for (int i = 0; i < vetBotoes.length; i++) {
			contentPane.add(vetBotoes[i]);
		}

	}

	public static void main(String[] args) {
		
		ExemploGridLayout grid = new ExemploGridLayout();
		grid.setVisible(true);
	}

}
