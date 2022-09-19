package pessoas;

public class Administrador extends Empregado{
	
	private float ajudaDeCusto;
	
	public Administrador() {
		ajudaDeCusto = 0;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public float calcularSalario() {
		return ajudaDeCusto+super.calcularSalario();
	}
}
