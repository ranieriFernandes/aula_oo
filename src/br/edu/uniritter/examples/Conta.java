package br.edu.uniritter.examples;

public class Conta {

	private int numero;
	private float saldo;
  
	public Conta(int numero, float saldoInicial) {
		this.numero = numero;
		this.saldo = saldoInicial;
	}
	
	public void deposita(float quantia) {
		if ( quantia > 0 ) {
			saldo += quantia;
		}
	}

	public void saca(float quantia) {
		saldo -= quantia;
	}
	
	public float verificaSaldo() {
		return saldo;
	}
	
	public int retornaNumeroConta() {
		return numero;
	}
}
