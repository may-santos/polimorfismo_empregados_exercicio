package empregados_exercicio_casa;

public class Empregado2 extends Empregado {
	
	private double percentualComissao;
	
	public Empregado2() {}
	
	public double getPercentualComissao() {
		return percentualComissao;
	}


	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}


	@Override
	public double getValorAReceber() {
		return getSalario() + (getSalario() * percentualComissao);
	}
}
