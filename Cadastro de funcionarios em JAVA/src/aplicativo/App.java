package aplicativo;

import javax.swing.JOptionPane;

import pessoas.Empregado;
import pessoas.Fornecedor;
import pessoas.Operario;
import pessoas.Pessoa;
import pessoas.Vendedor;
import pessoas.Administrador;

public class App {

	public static void main(String[] args) {
		
		Object [ ] opcoes = {"Pessoa", "Fornecedor", "Empregado", "Administrador", "Operario", "Vendedor"};
		
		float vC, vD, salario, imp, ajdC, valorProd, comis, valorV;
		
		Pessoa pessoa01 = new Pessoa();
		Fornecedor fornecedor01 = new Fornecedor();
		Empregado empregado01 = new Empregado();
		Administrador adm01 = new Administrador();
		Operario op01 = new Operario();
		Vendedor vd01 = new Vendedor();
		
		Object x = JOptionPane.showInputDialog(null, "Cadastro de pessoas", "Topo", 3, null, opcoes, "");
		
		if(x.equals("Pessoa")) {
			JOptionPane.showMessageDialog(null, "Cadastro de uma pessoa");
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");
			String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
			
			pessoa01.setNome(nome);
			pessoa01.setEndereco(endereco);
			pessoa01.setTelefone(telefone);
			
			JOptionPane.showMessageDialog(null,"Pessoa\n"+"Nome: "+pessoa01.getNome()+"\nEndereço: "
			+pessoa01.getEndereco()+"\nTelefone: "+pessoa01.getTelefone());
			
		}else if(x.equals("Fornecedor")) {
			JOptionPane.showMessageDialog(null, "Cadastro de um fornecedor");
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");
			String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
			String valorCredito = JOptionPane.showInputDialog(null, "Digite o valor do seu credito");
			String valorDivida = JOptionPane.showInputDialog(null, "Digite o valor da sua dívida");
			
			vC = Float.parseFloat(valorCredito);
			vD = Float.parseFloat(valorDivida);
			
			fornecedor01.setNome(nome);
			fornecedor01.setEndereco(endereco);
			fornecedor01.setTelefone(telefone);
			fornecedor01.setValorCredito(vC);
			fornecedor01.setValorDivida(vD);
			
			JOptionPane.showMessageDialog(null,"Fornecedor\n"+"Nome: "+fornecedor01.getNome()+"\nEndereço: "
			+fornecedor01.getEndereco()+"\nTelefone: "+fornecedor01.getTelefone()+"\nSaldo: "+fornecedor01.obterSaldo());
		
		}else if(x.equals("Empregado")) {
			JOptionPane.showMessageDialog(null, "Cadastro de um empregado");
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");
			String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
			String salarioBase = JOptionPane.showInputDialog(null, "Digite o salário base");
			String imposto = JOptionPane.showInputDialog(null, "Digite o valor do imposto");
			
			salario = Float.parseFloat(salarioBase);
			imp = Float.parseFloat(imposto);
			
			empregado01.setNome(nome);
			empregado01.setEndereco(endereco);
			empregado01.setTelefone(telefone);
			empregado01.setSalarioBase(salario);
			empregado01.setImposto(imp/100);
			
			JOptionPane.showMessageDialog(null,"Empregado\n"+"Nome: "+empregado01.getNome()+"\nEndereço: "
			+empregado01.getEndereco()+"\nTelefone: "+empregado01.getTelefone()+"\nSalário: "+empregado01.calcularSalario());
			
		}else if(x.equals("Administrador")) {
			JOptionPane.showMessageDialog(null, "Cadastro de um Administrador");
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");
			String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
			String salarioBase = JOptionPane.showInputDialog(null, "Digite o salário base");
			String imposto = JOptionPane.showInputDialog(null, "Digite o valor do imposto");
			String ajudaDeCusto = JOptionPane.showInputDialog(null, "Digite o valor da ajuda de custo");
			
			salario = Float.parseFloat(salarioBase);
			imp = Float.parseFloat(imposto);
			ajdC = Float.parseFloat(ajudaDeCusto);
			
			adm01.setNome(nome);
			adm01.setEndereco(endereco);
			adm01.setTelefone(telefone);
			adm01.setSalarioBase(salario);
			adm01.setImposto(imp/100);
			adm01.setAjudaDeCusto(ajdC);
			
			JOptionPane.showMessageDialog(null,"Empregado\n"+"Nome: "+adm01.getNome()+"\nEndereço: "
			+adm01.getEndereco()+"\nTelefone: "+adm01.getTelefone()+"\nSalário: "+adm01.calcularSalario());
		
		}else if(x.equals("Operario")) {
			JOptionPane.showMessageDialog(null, "Cadastro de um Operario");
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");
			String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
			String salarioBase = JOptionPane.showInputDialog(null, "Digite o salário base");
			String imposto = JOptionPane.showInputDialog(null, "Digite o valor do imposto");
			String valorProducao = JOptionPane.showInputDialog(null, "Digite o valor de produção");
			String comissao = JOptionPane.showInputDialog(null, "Digite o valor da comissao");
			
			salario = Float.parseFloat(salarioBase);
			imp = Float.parseFloat(imposto);
			valorProd = Float.parseFloat(valorProducao);
			comis = Float.parseFloat(comissao);
			
			op01.setNome(nome);
			op01.setEndereco(endereco);
			op01.setTelefone(telefone);
			op01.setSalarioBase(salario);
			op01.setImposto(imp/100);
			op01.setValorProducao(valorProd);
			op01.setComissao(comis/100);
			
			JOptionPane.showMessageDialog(null,"Operario\n"+"Nome: "+op01.getNome()+"\nEndereço: "
			+op01.getEndereco()+"\nTelefone: "+op01.getTelefone()+"\nSalário: "+op01.calcularSalario());
		
		}else if(x.equals("Vendedor")) {
			JOptionPane.showMessageDialog(null, "Cadastro de um Vendedor");
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço");
			String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone");
			String salarioBase = JOptionPane.showInputDialog(null, "Digite o salário base");
			String imposto = JOptionPane.showInputDialog(null, "Digite o valor do imposto");
			String valorVendas = JOptionPane.showInputDialog(null, "Digite o valor de vendas");
			String comissao = JOptionPane.showInputDialog(null, "Digite o valor da comissao");
			
			salario = Float.parseFloat(salarioBase);
			imp = Float.parseFloat(imposto);
			valorV = Float.parseFloat(valorVendas);
			comis = Float.parseFloat(comissao);
			
			vd01.setNome(nome);
			vd01.setEndereco(endereco);
			vd01.setTelefone(telefone);
			vd01.setSalarioBase(salario);
			vd01.setImposto(imp/100);
			vd01.setValorVendas(valorV);
			vd01.setComissao(comis/100);
			
			JOptionPane.showMessageDialog(null,"Operario\n"+"Nome: "+vd01.getNome()+"\nEndereço: "
			+vd01.getEndereco()+"\nTelefone: "+vd01.getTelefone()+"\nSalário: "+vd01.calcularSalario());
		}
	}
}
