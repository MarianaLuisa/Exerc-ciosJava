package atividade1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.ComponentOrientation;

public class ExemploFlowLayout extends JFrame {
	
	private JPanel contentPane;
	
	public ExemploFlowLayout()
	{
		JButton[] vetBotoes = {new JButton("Norte"), new JButton("Sul"), new JButton("Leste"), new JButton("Oeste"), new JButton("Centro")};
		
		setBounds(0, 0, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane= new JPanel();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		setContentPane(contentPane);
		
		for(int i=0; i<vetBotoes.length; i++)
		{
			contentPane.add(vetBotoes[i]);
		}
	}

	public static void main(String[] args) {
		
		ExemploFlowLayout flow = new ExemploFlowLayout();
		flow.setVisible(true);
		
	}
	
}
