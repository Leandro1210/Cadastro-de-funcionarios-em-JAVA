package pessoas;

public class Operario extends Empregado{
	
	private float valorProducao, comissao;
	
	public Operario() {
		valorProducao = 0;
		comissao = 0;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		comissao = valorProducao *(comissao/100);
		return comissao+super.calcularSalario();
	}
}
