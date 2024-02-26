package br.calculadora;

public class Calculadora {
	
	public int calcular(int valor) throws Exception {
		
		if (valor < 0) {
			throw new Exception("O valor deve ser positivo");
		}
		
		double desconto = 0;
		if (valor > 1000) {
			desconto = 0.3;
		} else if (valor > 500) {
			desconto = 0.25;
		} else {
			desconto = 0.1;
		}
		
		return (int) (valor - (valor * desconto));
	}

}