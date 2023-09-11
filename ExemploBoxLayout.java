package atividade1;

import java.awt.ComponentOrientation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class ExemploBoxLayout extends JFrame {

	private JPanel contentPane;

	public ExemploBoxLayout() {
		JButton[] vetBotoes = { new JButton("Norte"), new JButton("Sul"), new JButton("Leste"), new JButton("Oeste"),
				new JButton("Centro") };

		setBounds(0, 0, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		for (int i = 0; i < vetBotoes.length; i++) {
			contentPane.add(vetBotoes[i]);
		}

	}

	public static void main(String[] args) {

		ExemploBoxLayout box = new ExemploBoxLayout();
		box.setVisible(true);
	}

}
