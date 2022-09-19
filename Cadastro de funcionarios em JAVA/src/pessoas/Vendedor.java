package pessoas;

public class Vendedor extends Empregado{
	
	private float valorVendas, comissao;
	
	public Vendedor() {
		valorVendas = 0;
		comissao = 0;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario(){
		comissao = valorVendas*(comissao/100);
		return comissao+super.calcularSalario();
	}
}
