package questao1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class Calculadora extends JFrame {
	
	private JTextField textField;
	private JButton c1;

	public Calculadora() {
		setLocation(new Point(249, 328));

		JPanel painel1 = new JPanel();
		getContentPane().add(painel1, BorderLayout.NORTH);
		painel1.setLayout(new BorderLayout(0, 0));

		textField = new JTextField();
		textField.setLocation(new Point(249, 328));
		painel1.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		JPanel painel3 = new JPanel();
		getContentPane().add(painel3, BorderLayout.SOUTH);
		painel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		painel3.add(calcular);

		JPanel painel2 = new JPanel();
		getContentPane().add(painel2, BorderLayout.CENTER);
		painel2.setLayout(new GridLayout(4, 4, 0, 0));

		JButton a = new JButton("1");
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		painel2.add(a);

		JButton b = new JButton("2");
		painel2.add(b);

		JButton c = new JButton("3");
		painel2.add(c);

		JButton mais = new JButton("+");
		painel2.add(mais);

		JButton d = new JButton("4");
		painel2.add(d);

		JButton e = new JButton("5");
		painel2.add(e);

		JButton f = new JButton("6");
		painel2.add(f);

		JButton menos = new JButton("-");
		painel2.add(menos);

		JButton g = new JButton("7");
		painel2.add(g);

		JButton h = new JButton("8");
		painel2.add(h);

		JButton i = new JButton("9");
		painel2.add(i);

		JButton barra = new JButton("/");
		painel2.add(barra);

		JButton j = new JButton("0");
		painel2.add(j);

		JButton chapeu = new JButton("^");
		painel2.add(chapeu);

		c1 = new JButton("C");
		painel2.add(c1);

		JButton ce = new JButton("CE");
		painel2.add(ce);

	}

}
