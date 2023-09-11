package atividade3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField ValorRaio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle(" Calculando a Área de um Círculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 370, 150);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LabelRaio = new JLabel("Raio");
		LabelRaio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelRaio.setBounds(10, 11, 46, 14);
		contentPane.add(LabelRaio);
		
		ValorRaio = new JTextField();
		ValorRaio.setBounds(66, 10, 145, 20);
		contentPane.add(ValorRaio);
		ValorRaio.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular área do círculo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(20, 36, 207, 23);
		contentPane.add(btnNewButton);
		
		JLabel LabelResultado = new JLabel("Resultado");
		LabelResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelResultado.setBounds(10, 70, 128, 23);
		contentPane.add(LabelResultado);
	}
}
