package br.com.herança;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void testSenhaTrue() {
		Gerente gerente = new Gerente();
		gerente.Senha(5555);
		assertEquals(gerente.autentica(5555), true);
	}

	@Test
	public void testSenhaFalse() {
		Gerente gerente = new Gerente();
		gerente.Senha(5555);
		assertEquals(gerente.autentica(4545), false);
	}

	@Test
	public void testNome() {
		Gerente gerente = new Gerente();
		gerente.Nome("grovy");
		assertEquals(gerente.GetNome(), "grovy");
	}

	@Test
	public void testNomeFuncionario() {
		Funcionario funcionario = new Funcionario();
		funcionario.Nome("Irma");
		assertEquals(funcionario.GetNome(), "Irma");

	}

}
