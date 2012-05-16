package br.edu.uniritter.examples;

public class Calculator {

	private int a;
	private int b;
	
	public Calculator( int p1, int p2) {
		this.a=p1;
		this.b=p2;
	}
	public double add() {
		return a+b;
	}
	
	public double sub() {
		return a-b;
	}
	
	public double mult() {
		return a*b;
	}

	public double div() {
		return (double)a/b;
	}

	public double fact() {
		int resultado = 1;
		for (int i=2; i <= a; i++) {
			resultado *= i;
		}
		return resultado;
	}

}
