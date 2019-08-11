package empregados_exercicio_casa;

public class Empregado1 extends Empregado {
	
	@Override
	public double getValorAReceber() {
		return getSalario();
	}
}
