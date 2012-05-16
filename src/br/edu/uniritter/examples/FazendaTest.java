package br.edu.uniritter.examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FazendaTest {

	private Fazenda fazenda;
	
	@Before
	public void setUp() throws Exception {
		fazenda = new Fazenda(10, 20, 10, 20);
	}

	@Test
	public void testReceberDadosQuedaDentro1() {
		fazenda.receberDadosQueda(11, 11);
		assertEquals(1, fazenda.getNumeroDeMeteoros());
	}
	
	@Test
	public void testReceberDadosQuedaFora1() {
		fazenda.receberDadosQueda(1, 1);
		assertEquals(0, fazenda.getNumeroDeMeteoros());
	}
	
	@Test
	public void testReceberDadosQuedaContador() {
		fazenda.receberDadosQueda(15, 15);
		fazenda.receberDadosQueda(15, 15);
		assertEquals(2, fazenda.getNumeroDeMeteoros());
	}

}
