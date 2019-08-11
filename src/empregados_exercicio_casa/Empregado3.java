package empregados_exercicio_casa;

public class Empregado3 extends Empregado {
	private double percentual;
	private double bonus;
	
	public Empregado3 () {}
	
	public double getPercentual() {
		return percentual;
	}


	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	@Override
	public double getValorAReceber() {
		return salario + (salario * percentual) + bonus;
	}
}
