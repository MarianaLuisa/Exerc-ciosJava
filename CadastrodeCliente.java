package questao2;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastrodeCliente extends JFrame{
	private JTextField cpf;
	private JTextField nome;
	private JTextField endereco;
	public CadastrodeCliente() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel painel1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) painel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(painel1);
		
		JLabel cpf1 = new JLabel("CPF");
		painel1.add(cpf1);
		
		cpf = new JTextField();
		painel1.add(cpf);
		cpf.setColumns(10);
		
		JLabel nome1 = new JLabel("Nome");
		painel1.add(nome1);
		
		nome = new JTextField();
		painel1.add(nome);
		nome.setColumns(32);
		
		JPanel painel2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) painel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		getContentPane().add(painel2);
		
		JLabel endereço1 = new JLabel("Endereço");
		painel2.add(endereço1);
		
		endereco = new JTextField();
		painel2.add(endereco);
		endereco.setColumns(22);
		
		JLabel profissao = new JLabel("Profissão");
		painel2.add(profissao);
		
		JComboBox profissao1 = new JComboBox();
		profissao1.setPreferredSize(new Dimension(122, 24));
		painel2.add(profissao1);
		
		
		
		JPanel painel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) painel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		getContentPane().add(painel3);
		
		JButton cadastrar = new JButton("CADASTRAR");
		painel3.add(cadastrar);
		
		JButton limpar = new JButton("LIMPAR");
		painel3.add(limpar);
	}

}
