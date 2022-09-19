package itensVisuais;

import javax.swing.*;
import pessoas.Pessoa;
import pessoas.Administrador;
import pessoas.Empregado;
import pessoas.Fornecedor;
import pessoas.Operario;
import pessoas.Vendedor;
import java.awt.*;
import java.awt.event.*;

public class MeuFrame extends JFrame implements ActionListener {

	// Elementos do formulario
	private Container container;
	private JLabel titulo;
	private JLabel nome;
	private JTextField tnome;
	private JLabel numeroCelular;
	private JTextField tNumeroCelular;
	private JLabel cdgSetor;
	private JTextField tCdgSetor;
	private JLabel salarioBase;
	private JTextField tSalarioBase;
	private JLabel imposto;
	private JTextField tImposto;
	private JLabel valorCredito;
	private JTextField tValorCredito;
	private JLabel valorDivida;
	private JTextField tValorDivida;
	private JLabel ajudaDeCusto;
	private JTextField tAjudaDeCusto;
	private JLabel valorProducao;
	private JTextField tValorProducao;
	private JLabel comissao;
	private JTextField tComissao;
	private JLabel valorVendas;
	private JTextField tValorVendas;
	private JComboBox<String> op = new JComboBox<String>();
	private JLabel endereco;
	private JTextArea tEndereco;
	private JCheckBox termoConcentimento;
	private JButton bSubmeter;
	private JButton bresetar;
	private JTextArea tAOutrasInformacoes;
	private JLabel mensagem;
	private JTextArea jTMensagemErro;
	
	public MeuFrame()
	{			
		setTitle("Formulario de Registro");
		setBounds(300, 90, 860, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		op.addItem("");
		op.addItem("Pessoa");
		op.addItem("Fornecedor");
		op.addItem("Empregado");
		op.addItem("Administrador");
		op.addItem("Operario");
		op.addItem("Vendedor");
		
		container = getContentPane();
		container.setLayout(null);

		titulo = new JLabel("Formulario de Registro");
		titulo.setFont(new Font("Arial", Font.PLAIN, 25));
		titulo.setSize(300, 30);
		titulo.setLocation(300, 30);
		container.add(titulo);
		
		titulo = new JLabel("Escolha o colaborador");
		titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		titulo.setSize(300, 30);
		titulo.setLocation(325, 80);
		container.add(titulo);
		
		op.setFont(new Font("Arial", Font.PLAIN, 15));
		op.setSize(120, 20);
		op.setLocation(380, 130);
		
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("")) {
						JOptionPane.showMessageDialog(null, "Selecione uma opção");	
					}
				}
			}
		});
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("Pessoa")) {
						nome.setSize(100, 20);
						nome.setLocation(120, 180);
						tnome.setSize(200, 20);
						tnome.setLocation(220, 180);
						numeroCelular.setSize(100, 20);
						numeroCelular.setLocation(120, 210);
						tNumeroCelular.setSize(200, 20);
						tNumeroCelular.setLocation(220, 210);
						endereco.setSize(100, 20);
						endereco.setLocation(120, 240);
						tEndereco.setSize(200, 75);
						tEndereco.setLocation(220, 240);
						cdgSetor.setVisible(false);
						tCdgSetor.setVisible(false);
						salarioBase.setVisible(false);
						tSalarioBase.setVisible(false);
						imposto.setVisible(false);
						tImposto.setVisible(false);
						valorCredito.setVisible(false);
						tValorCredito.setVisible(false);
						valorDivida.setVisible(false);
						tValorDivida.setVisible(false);
						ajudaDeCusto.setVisible(false);
						tAjudaDeCusto.setVisible(false);
						valorProducao.setVisible(false);
						tValorProducao.setVisible(false);
						comissao.setVisible(false);
						tComissao.setVisible(false);
						valorVendas.setVisible(false);
						tValorVendas.setVisible(false);
					}
				}
			}
		});
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("Fornecedor")) {
						nome.setSize(100, 20);
						nome.setLocation(120, 180);
						tnome.setSize(200, 20);
						tnome.setLocation(220, 180);
						numeroCelular.setSize(100, 20);
						numeroCelular.setLocation(120, 210);
						tNumeroCelular.setSize(200, 20);
						tNumeroCelular.setLocation(220, 210);
						valorCredito.setSize(100, 20);
						valorCredito.setLocation(120, 240);
						tValorCredito.setSize(200, 20);
						tValorCredito.setLocation(220, 240);
						valorDivida.setSize(100, 20);
						valorDivida.setLocation(120, 270);
						tValorDivida.setSize(200, 20);
						tValorDivida.setLocation(220, 270);
						endereco.setSize(100, 20);
						endereco.setLocation(120, 300);
						tEndereco.setSize(200, 75);
						tEndereco.setLocation(220, 300);
						cdgSetor.setVisible(false);
						tCdgSetor.setVisible(false);
						salarioBase.setVisible(false);
						tSalarioBase.setVisible(false);
						imposto.setVisible(false);
						tImposto.setVisible(false);
						valorCredito.setVisible(true);
						tValorCredito.setVisible(true);
						valorDivida.setVisible(true);
						tValorDivida.setVisible(true);
						ajudaDeCusto.setVisible(false);
						tAjudaDeCusto.setVisible(false);
						valorProducao.setVisible(false);
						tValorProducao.setVisible(false);
						comissao.setVisible(false);
						tComissao.setVisible(false);
						valorVendas.setVisible(false);
						tValorVendas.setVisible(false);
					}
				}
			}
		});
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("Empregado")) {
						nome.setSize(100, 20);
						nome.setLocation(120, 180);
						tnome.setSize(200, 20);
						tnome.setLocation(220, 180);
						numeroCelular.setSize(100, 20);
						numeroCelular.setLocation(120, 210);
						tNumeroCelular.setSize(200, 20);
						tNumeroCelular.setLocation(220, 210);
						cdgSetor.setSize(100, 20);
						cdgSetor.setLocation(120, 240);
						tCdgSetor.setSize(200, 20);
						tCdgSetor.setLocation(220, 240);
						salarioBase.setSize(100, 20);
						salarioBase.setLocation(120, 270);
						tSalarioBase.setSize(200, 20);
						tSalarioBase.setLocation(220, 270);
						imposto.setSize(100, 20);
						imposto.setLocation(120, 300);
						tImposto.setSize(200, 20);
						tImposto.setLocation(220, 300);
						endereco.setSize(100, 20);
						endereco.setLocation(120, 330);
						tEndereco.setSize(200, 75);
						tEndereco.setLocation(220, 330);
						cdgSetor.setVisible(true);
						tCdgSetor.setVisible(true);
						salarioBase.setVisible(true);
						tSalarioBase.setVisible(true);
						imposto.setVisible(true);
						tImposto.setVisible(true);
						valorCredito.setVisible(false);
						tValorCredito.setVisible(false);
						valorDivida.setVisible(false);
						tValorDivida.setVisible(false);
						ajudaDeCusto.setVisible(false);
						tAjudaDeCusto.setVisible(false);
						valorProducao.setVisible(false);
						tValorProducao.setVisible(false);
						comissao.setVisible(false);
						tComissao.setVisible(false);
						valorVendas.setVisible(false);
						tValorVendas.setVisible(false);
					}
				}
			}
		});
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("Administrador")) {
						nome.setSize(100, 20);
						nome.setLocation(120, 180);
						tnome.setSize(200, 20);
						tnome.setLocation(220, 180);
						numeroCelular.setSize(100, 20);
						numeroCelular.setLocation(120, 210);
						tNumeroCelular.setSize(200, 20);
						tNumeroCelular.setLocation(220, 210);
						cdgSetor.setSize(100, 20);
						cdgSetor.setLocation(120, 240);
						tCdgSetor.setSize(200, 20);
						tCdgSetor.setLocation(220, 240);
						salarioBase.setSize(100, 20);
						salarioBase.setLocation(120, 270);
						tSalarioBase.setSize(200, 20);
						tSalarioBase.setLocation(220, 270);
						imposto.setSize(100, 20);
						imposto.setLocation(120, 300);
						tImposto.setSize(200, 20);
						tImposto.setLocation(220, 300);
						ajudaDeCusto.setSize(100, 20);
						ajudaDeCusto.setLocation(120, 330);
						tAjudaDeCusto.setSize(200, 20);
						tAjudaDeCusto.setLocation(220, 330);
						endereco.setSize(100, 20);
						endereco.setLocation(120, 360);
						tEndereco.setSize(200, 75);
						tEndereco.setLocation(220, 360);
						cdgSetor.setVisible(true);
						tCdgSetor.setVisible(true);
						salarioBase.setVisible(true);
						tSalarioBase.setVisible(true);
						imposto.setVisible(true);
						tImposto.setVisible(true);
						valorCredito.setVisible(false);
						tValorCredito.setVisible(false);
						valorDivida.setVisible(false);
						tValorDivida.setVisible(false);
						ajudaDeCusto.setVisible(true);
						tAjudaDeCusto.setVisible(true);
						valorProducao.setVisible(false);
						tValorProducao.setVisible(false);
						comissao.setVisible(false);
						tComissao.setVisible(false);
						valorVendas.setVisible(false);
						tValorVendas.setVisible(false);
					}
				}
			}
		});
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("Operario")) {
						nome.setSize(100, 20);
						nome.setLocation(120, 180);
						tnome.setSize(200, 20);
						tnome.setLocation(220, 180);
						numeroCelular.setSize(100, 20);
						numeroCelular.setLocation(120, 210);
						tNumeroCelular.setSize(200, 20);
						tNumeroCelular.setLocation(220, 210);
						cdgSetor.setSize(100, 20);
						cdgSetor.setLocation(120, 240);
						tCdgSetor.setSize(200, 20);
						tCdgSetor.setLocation(220, 240);
						salarioBase.setSize(100, 20);
						salarioBase.setLocation(120, 270);
						tSalarioBase.setSize(200, 20);
						tSalarioBase.setLocation(220, 270);
						imposto.setSize(100, 20);
						imposto.setLocation(120, 300);
						tImposto.setSize(200, 20);
						tImposto.setLocation(220, 300);
						valorProducao.setSize(100, 20);
						valorProducao.setLocation(120, 330);
						tValorProducao.setSize(200, 20);
						tValorProducao.setLocation(220, 330);
						comissao.setSize(100, 20);
						comissao.setLocation(120, 360);
						tComissao.setSize(200, 20);
						tComissao.setLocation(220, 360);
						endereco.setSize(100, 20);
						endereco.setLocation(120, 390);
						tEndereco.setSize(200, 75);
						tEndereco.setLocation(220, 390);
						cdgSetor.setVisible(true);
						tCdgSetor.setVisible(true);
						salarioBase.setVisible(true);
						tSalarioBase.setVisible(true);
						imposto.setVisible(true);
						tImposto.setVisible(true);
						valorCredito.setVisible(false);
						tValorCredito.setVisible(false);
						valorDivida.setVisible(false);
						tValorDivida.setVisible(false);
						ajudaDeCusto.setVisible(false);
						tAjudaDeCusto.setVisible(false);
						valorProducao.setVisible(true);
						tValorProducao.setVisible(true);
						comissao.setVisible(true);
						tComissao.setVisible(true);
						valorVendas.setVisible(false);
						tValorVendas.setVisible(false);
					}
				}
			}
		});
		op.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(op.getSelectedItem().toString().equals("Vendedor")) {
						nome.setSize(100, 20);
						nome.setLocation(120, 180);
						tnome.setSize(200, 20);
						tnome.setLocation(220, 180);
						numeroCelular.setSize(100, 20);
						numeroCelular.setLocation(120, 210);
						tNumeroCelular.setSize(200, 20);
						tNumeroCelular.setLocation(220, 210);
						cdgSetor.setSize(100, 20);
						cdgSetor.setLocation(120, 240);
						tCdgSetor.setSize(200, 20);
						tCdgSetor.setLocation(220, 240);
						salarioBase.setSize(100, 20);
						salarioBase.setLocation(120, 270);
						tSalarioBase.setSize(200, 20);
						tSalarioBase.setLocation(220, 270);
						imposto.setSize(100, 20);
						imposto.setLocation(120, 300);
						tImposto.setSize(200, 20);
						tImposto.setLocation(220, 300);
						valorVendas.setSize(100, 20);
						valorVendas.setLocation(120, 330);
						tValorVendas.setSize(200, 20);
						tValorVendas.setLocation(220, 330);
						comissao.setSize(100, 20);
						comissao.setLocation(120, 360);
						tComissao.setSize(200, 20);
						tComissao.setLocation(220, 360);
						endereco.setSize(100, 20);
						endereco.setLocation(120, 390);
						tEndereco.setSize(200, 75);
						tEndereco.setLocation(220, 390);
						cdgSetor.setVisible(true);
						tCdgSetor.setVisible(true);
						salarioBase.setVisible(true);
						tSalarioBase.setVisible(true);
						imposto.setVisible(true);
						tImposto.setVisible(true);
						valorCredito.setVisible(false);
						tValorCredito.setVisible(false);
						valorDivida.setVisible(false);
						tValorDivida.setVisible(false);
						ajudaDeCusto.setVisible(false);
						tAjudaDeCusto.setVisible(false);
						valorProducao.setVisible(false);
						tValorProducao.setVisible(false);
						valorVendas.setVisible(true);
						tValorVendas.setVisible(true);
						comissao.setVisible(true);
						tComissao.setVisible(true);
					}
				}
			}
		});
		container.add(op);
			
		nome = new JLabel("Nome");
		nome.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(nome);

		tnome = new JTextField();
		tnome.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tnome);
		
		numeroCelular = new JLabel("Celular");
		numeroCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(numeroCelular);

		tNumeroCelular = new JTextField();
		tNumeroCelular.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tNumeroCelular);
		
		endereco = new JLabel("Endereco");
		endereco.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(endereco);

		tEndereco = new JTextArea();
		tEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
		tEndereco.setLineWrap(true);
		tEndereco.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(tEndereco);
		
		cdgSetor = new JLabel("Cdg. Setor");
		cdgSetor.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(cdgSetor);
		
		tCdgSetor = new JTextField();
		tCdgSetor.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tCdgSetor);
		
		salarioBase = new JLabel("Salário");
		salarioBase.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(salarioBase);
		
		tSalarioBase = new JTextField();
		tSalarioBase.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tSalarioBase);
		
		imposto = new JLabel("Imposto");
		imposto.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(imposto);
		
		tImposto = new JTextField();
		tImposto.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tImposto);
		
		valorCredito = new JLabel("Val. Crédito");
		valorCredito.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(valorCredito);
		
		tValorCredito = new JTextField();
		tValorCredito.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tValorCredito);
		
		valorDivida = new JLabel("Val. Divida");
		valorDivida.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(valorDivida);
		
		tValorDivida= new JTextField();
		tValorDivida.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tValorDivida);
		
		ajudaDeCusto = new JLabel("Ajud. de Custo");
		ajudaDeCusto.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(ajudaDeCusto);
		
		tAjudaDeCusto = new JTextField();
		tAjudaDeCusto.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tAjudaDeCusto);
		
		valorProducao = new JLabel("Valor produção");
		valorProducao.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(valorProducao);
		
		tValorProducao = new JTextField();
		tValorProducao.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tValorProducao);
		
		comissao = new JLabel("Comissão");
		comissao.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(comissao);
		
		tComissao= new JTextField();
		tComissao.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tComissao);
		
		valorVendas = new JLabel("Valor Vendas");
		valorVendas.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(valorVendas);
		
		tValorVendas = new JTextField();
		tValorVendas.setFont(new Font("Arial", Font.PLAIN, 15));
		container.add(tValorVendas);
		
		termoConcentimento = new JCheckBox("Aceitar termos e condições");
		termoConcentimento.setFont(new Font("Arial", Font.PLAIN, 15));
		termoConcentimento.setSize(250, 20);
		termoConcentimento.setLocation(150, 520);
		container.add(termoConcentimento);
		
		bSubmeter = new JButton("Enviar");
		bSubmeter.setFont(new Font("Arial", Font.PLAIN, 15));
		bSubmeter.setSize(100, 20);
		bSubmeter.setLocation(150, 550);
		bSubmeter.addActionListener(this);
		container.add(bSubmeter);

		bresetar = new JButton("Resetar");
		bresetar.setFont(new Font("Arial", Font.PLAIN, 15));
		bresetar.setSize(100, 20);
		bresetar.setLocation(270, 550);
		bresetar.addActionListener(this);
		container.add(bresetar);
		
		tAOutrasInformacoes = new JTextArea();
		tAOutrasInformacoes.setFont(new Font("Arial", Font.PLAIN, 15));
		tAOutrasInformacoes.setSize(300, 400);
		tAOutrasInformacoes.setLocation(520, 180);
		tAOutrasInformacoes.setBorder(BorderFactory.createLineBorder(Color.black));
		tAOutrasInformacoes.setLineWrap(true);
		tAOutrasInformacoes.setEditable(false);
		container.add(tAOutrasInformacoes);

		mensagem = new JLabel("");
		mensagem.setFont(new Font("Arial", Font.PLAIN, 20));
		mensagem.setSize(500, 25);
		mensagem.setLocation(100, 480);
		container.add(mensagem);

		jTMensagemErro = new JTextArea();
		jTMensagemErro.setFont(new Font("Arial", Font.PLAIN, 15));
		jTMensagemErro.setSize(200, 75);
		jTMensagemErro.setLocation(600, 300);
		jTMensagemErro.setLineWrap(true);
		container.add(jTMensagemErro);
		
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == bSubmeter) {
			if (termoConcentimento.isSelected() && op.getSelectedItem().toString().equals("Pessoa")) {
				Pessoa p = new Pessoa();
				
				p.setNome(tnome.getText());
				p.setTelefone(tNumeroCelular.getText());
				p.setEndereco(tEndereco.getText());
				
				String dados1
				= "Nome : "
						+ p.getNome() + "\n"
						+ "Celular : "
						+ p.getTelefone() + "\n";
				
				String dados2 = "Endereco : " + p.getEndereco();
				tAOutrasInformacoes.setText(dados1 + dados2);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
				
			}else if(termoConcentimento.isSelected() && op.getSelectedItem().toString().equals("Fornecedor")) {
				Fornecedor forn = new Fornecedor();
				
				forn.setNome(tnome.getText());
				forn.setTelefone(tNumeroCelular.getText());
				forn.setValorCredito(Float.parseFloat(tValorCredito.getText()));
				forn.setValorDivida(Float.parseFloat(tValorDivida.getText()));
				forn.setEndereco(tEndereco.getText());
				
				String dados1
				= "Nome : "
						+ forn.getNome() + "\n"
						+ "Celular : "
						+ forn.getTelefone() + "\n"
						+ "Valor Crédito : "
						+ forn.getValorCredito() + "\n"
						+ "Valor Divida : "
						+ forn.getValorDivida() + "\n"
						+ "Saldo : "
						+ forn.obterSaldo()+"\n";
				
				String dados2 = "Endereco : " + forn.getEndereco();
				tAOutrasInformacoes.setText(dados1 + dados2);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
				
			}else if(termoConcentimento.isSelected() && op.getSelectedItem().toString().equals("Empregado")) {
				Empregado emp = new Empregado();
				
				emp.setNome(tnome.getText());
				emp.setTelefone(tNumeroCelular.getText());
				emp.setCodigoSetor(Integer.parseInt(tCdgSetor.getText()));
				emp.setSalarioBase(Float.parseFloat(tSalarioBase.getText()));
				emp.setImposto(Float.parseFloat(tImposto.getText()));
				emp.setEndereco(tEndereco.getText());
				
				String dados1
				= "Nome : "
						+ emp.getNome() + "\n"
						+ "Celular : "
						+ emp.getTelefone() + "\n"
						+ "Código Setor : "
						+ emp.getCodigoSetor() + "\n"
						+ "Salário Base : "
						+ emp.getSalarioBase() + "\n"
						+ "Imposto : "
						+ emp.getImposto()+"%"+"\n"
						+ "Salário final: "
						+ emp.calcularSalario()+"\n";
				
				String dados2 = "Endereco : " + emp.getEndereco();
				tAOutrasInformacoes.setText(dados1 + dados2);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
				
			}else if(termoConcentimento.isSelected() && op.getSelectedItem().toString().equals("Administrador")) {
				Administrador adm = new Administrador();
				
				adm.setNome(tnome.getText());
				adm.setTelefone(tNumeroCelular.getText());
				adm.setCodigoSetor(Integer.parseInt(tCdgSetor.getText()));
				adm.setSalarioBase(Float.parseFloat(tSalarioBase.getText()));
				adm.setImposto(Float.parseFloat(tImposto.getText()));
				adm.setAjudaDeCusto(Float.parseFloat(tAjudaDeCusto.getText()));
				adm.setEndereco(tEndereco.getText());
				
				String dados1
				= "Nome : "
						+ adm.getNome() + "\n"
						+ "Celular : "
						+ adm.getTelefone() + "\n"
						+ "Código Setor : "
						+ adm.getCodigoSetor() + "\n"
						+ "Salário Base : "
						+ adm.getSalarioBase() + "\n"
						+ "Imposto : "
						+ adm.getImposto()+"%"+"\n"
						+ "Ajuda de custo: "
						+ adm.getAjudaDeCusto()+"\n"
						+ "Salário final: "
						+ adm.calcularSalario()+"\n";
				
				String dados2 = "Endereco : " + adm.getEndereco();
				tAOutrasInformacoes.setText(dados1 + dados2);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
				
			}else if(termoConcentimento.isSelected() && op.getSelectedItem().toString().equals("Operario")) {
				Operario op = new Operario();
				
				op.setNome(tnome.getText());
				op.setTelefone(tNumeroCelular.getText());
				op.setCodigoSetor(Integer.parseInt(tCdgSetor.getText()));
				op.setSalarioBase(Float.parseFloat(tSalarioBase.getText()));
				op.setImposto(Float.parseFloat(tImposto.getText()));
				op.setValorProducao(Float.parseFloat(tValorProducao.getText()));
				op.setComissao(Float.parseFloat(tComissao.getText()));
				op.setEndereco(tEndereco.getText());
				
				String dados1
				= "Nome : "
						+ op.getNome() + "\n"
						+ "Celular : "
						+ op.getTelefone() + "\n"
						+ "Código Setor : "
						+ op.getCodigoSetor() + "\n"
						+ "Salário Base : "
						+ op.getSalarioBase() + "\n"
						+ "Imposto : "
						+ op.getImposto()+"%"+"\n"
						+ "Valor produção : "
						+ op.getValorProducao()+"\n"
						+ "Comissão : "
						+ op.getComissao()+"%"+"\n"
						+ "Salário final: "
						+ op.calcularSalario()+"\n";
				
				String dados2 = "Endereco : " + op.getEndereco();
				tAOutrasInformacoes.setText(dados1 + dados2);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
				
			}else if(termoConcentimento.isSelected() && op.getSelectedItem().toString().equals("Vendedor")) {
				Vendedor vd = new Vendedor();
				
				vd.setNome(tnome.getText());
				vd.setTelefone(tNumeroCelular.getText());
				vd.setCodigoSetor(Integer.parseInt(tCdgSetor.getText()));
				vd.setSalarioBase(Float.parseFloat(tSalarioBase.getText()));
				vd.setImposto(Float.parseFloat(tImposto.getText()));
				vd.setValorVendas(Float.parseFloat(tValorVendas.getText()));
				vd.setComissao(Float.parseFloat(tComissao.getText()));
				vd.setEndereco(tEndereco.getText());
				
				String dados1
				= "Nome : "
						+ vd.getNome() + "\n"
						+ "Celular : "
						+ vd.getTelefone() + "\n"
						+ "Código Setor : "
						+ vd.getCodigoSetor() + "\n"
						+ "Salário Base : "
						+ vd.getSalarioBase() + "\n"
						+ "Imposto : "
						+ vd.getImposto()+"%"+"\n"
						+ "Valor Vendas : "
						+ vd.getValorVendas()+"\n"
						+ "Comissão : "
						+ vd.getComissao()+"%"+"\n"
						+ "Salário final: "
						+ vd.calcularSalario()+"\n";
				
				String dados2 = "Endereco : " + vd.getEndereco();
				tAOutrasInformacoes.setText(dados1 + dados2);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
			}
			else {
				tAOutrasInformacoes.setText("");
				jTMensagemErro.setText("");
				mensagem.setText("Por favor aceite os"
						+ " termos e condições");
				mensagem.setForeground(Color.RED);
			}
		}
		else if (e.getSource() == bresetar) {
			String def = "";
			tnome.setText(def);
			tEndereco.setText(def);
			tNumeroCelular.setText(def);
			tSalarioBase.setText(def);
			tComissao.setText(def);
			tAjudaDeCusto.setText(def);
			tValorCredito.setText(def);
			tValorDivida.setText(def);
			tCdgSetor.setText(def);
			tImposto.setText(def);
			tValorProducao.setText(def);
			tValorVendas.setText(def);
			mensagem.setText(def);
			tAOutrasInformacoes.setText(def);
			termoConcentimento.setSelected(false);
			op.setSelectedIndex(0);
			jTMensagemErro.setText(def);
		}
	}
}