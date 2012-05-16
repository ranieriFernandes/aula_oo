package br.edu.uniritter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.examples.Conta;

public class ContaTest {

	private Conta conta;
	private int numero = 123;
	private float saldo = 500;
	
	@Before
	public void configura() {
		conta= new Conta(numero,saldo);

	}
	@Test
	public void testDeposita() {
		conta.deposita(100);
		assertEquals(saldo+100,conta.verificaSaldo(),0.1);
	}

	@Test
	public void testSaca() {
		conta.saca(100);
		assertEquals(saldo-100,conta.verificaSaldo(),0.1);
	}

	@Test
	public void testVerificaSaldo() {
		assertEquals(saldo,conta.verificaSaldo(),0.1);
	}

	@Test
	public void testRetornaNumeroConta() {
		assertEquals(numero,conta.retornaNumeroConta(),0.1);
	}

}
