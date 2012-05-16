package br.edu.uniritter.examples;

public class Fazenda {
	
	private int limiteX1, limiteX2, limiteY1, limiteY2;
	
	private int numeroDeMeteoros = 0;

	public Fazenda(int limiteX1, int limiteX2, int limiteY1, int limiteY2) {
		super();
		this.limiteX1 = limiteX1;
		this.limiteX2 = limiteX2;
		this.limiteY1 = limiteY1;
		this.limiteY2 = limiteY2;
	}

	public void receberDadosQueda(int x, int y){
		if ((x >= this.limiteX1) && 
			(x <= this.limiteX2) && 
			(y >= this.limiteY1) && 
			(y <= this.limiteY2)){
			this.numeroDeMeteoros++;
		}
	}
	
	public int getNumeroDeMeteoros() {
		return numeroDeMeteoros;
	}

}
