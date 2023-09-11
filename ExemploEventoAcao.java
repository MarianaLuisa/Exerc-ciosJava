package atividade3;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import atividade2.ExemploCardLayout;

public class ExemploEventoAcao extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel labelMensagem;

	public ExemploEventoAcao() {
		setBounds(0, 0, 600, 300);
		setDefaultCloseOperation(ExemploEventoAcao.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton buttonAperte = new JButton("Aperte-me");
		buttonAperte.addActionListener(this);
		contentPane.add(buttonAperte);

		labelMensagem = new JLabel("");
		contentPane.add(labelMensagem);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Aperte-me")) {
			labelMensagem.setText("Botão pressionado");
		}
	}

	public static void main(String[] args) {

		ExemploEventoAcao exe = new ExemploEventoAcao();
		exe.setVisible(true);
	}

}
