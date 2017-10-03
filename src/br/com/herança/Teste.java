package br.com.herança;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Gerente gerente = new Gerente();
		gerente.Senha(5555);
		assertEquals(gerente.autentica(5555), true);
	}

	@Test
	public void test1() {
		Gerente gerente = new Gerente();
		gerente.Senha(5555);
		assertEquals(gerente.autentica(4545), false);
	}

	@Test
	public void test2() {
		Gerente gerente = new Gerente();
		gerente.Nome("grovy");
		assertEquals(gerente.GetNome(), "grovy");
	}
}
