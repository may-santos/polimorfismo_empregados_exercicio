package empregados_exercicio_casa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		List <Empregado> empregados = 
				new ArrayList <> (); // operador diamante

		Empregado1 e1 = new Empregado1 ();
		Empregado2 e2 = new Empregado2 ();
		Empregado3 e3 = new Empregado3 ();
		Empregado4 e4 = new Empregado4 ();
		
		e1.setSalario(2500 + gerador.nextDouble() * 700);
		
		e2.setSalario(1500 + gerador.nextDouble() * 500);
		e2.setPercentualComissao(gerador.nextDouble());
		
		e3.setSalario(1200 + gerador.nextDouble() * 500);
		e3.setPercentual(gerador.nextDouble());
		e3.setBonus(500 + gerador.nextDouble() * 500);		
		
		e4.setSalario(200 + gerador.nextDouble() * 2000);

		empregados.add(e1);
		empregados.add(e2);
		empregados.add(e3);
		empregados.add(e4);
		
		for (Empregado e : empregados){
			System.out.println("Valor a receber: " + e.getValorAReceber());
		}

	}

}
