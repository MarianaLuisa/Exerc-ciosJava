package atividade2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ExemploCardLayout extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private CardLayout card;
	
	public ExemploCardLayout()
	{
		
		setBounds(0, 0, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem itemTela1 = new JMenuItem("Tela 1");
		itemTela1.addActionListener(this);
		menuArquivo.add(itemTela1);
		
		JMenuItem itemTela2 = new JMenuItem("Tela 2");
		itemTela2.addActionListener(this);
		menuArquivo.add(itemTela2);
		contentPane = new JPanel();
		setContentPane(contentPane);
		card = new CardLayout();
		contentPane.setLayout(card);
		
		contentPane.add(new JPanel(), "tela0");
		contentPane.add(new TelaPainel1(), "tela1");
		contentPane.add(new TelaPainel2(), "tela2");
		
		//card.show(contentPane, "tela1");
		
	}
	
	public static void main(String[] args) {
		
		ExemploCardLayout ecard = new ExemploCardLayout();
		ecard.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Tela 1"))
		{
			card.show(contentPane, "tela1");
		}
		else if (e.getActionCommand().equals("Tela 2"))
		{
			card.show(contentPane, "tela2");
		}
		
	}

}
