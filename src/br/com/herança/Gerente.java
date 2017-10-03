package br.com.herança;

public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;

	public int Senha(int senhaa) {
		return senha = senhaa;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
