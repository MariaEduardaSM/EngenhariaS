package Testes;

import org.junit.Test;

import Login.Usuario;

import static org.junit.Assert.*;

public class TesteAlterarSenha {

	Usuario usuario = new Usuario("duda", "duda@gmail.com", "123456", "Rua A, 10", "999999999");

	@Test
	public void testeAlterarSenhaCorreta() {
		boolean resultado = usuario.alterarSenha("123456", "654321");
		assertTrue(resultado);
	}

	@Test
	public void testeAlterarSenhaIncorreta() {
		boolean resultado = usuario.alterarSenha("111111", "654321");
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaIgual() {
		boolean resultado = usuario.alterarSenha("123456", "123456");
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaNula() {
		boolean resultado = usuario.alterarSenha(null, "654321");
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaVazia() {
		boolean resultado = usuario.alterarSenha("", "654321");
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaNovaNula() {
		boolean resultado = usuario.alterarSenha("123456", null);
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaNovaVazia() {
		boolean resultado = usuario.alterarSenha("123456", "");
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaAmbasNulas() {
		boolean resultado = usuario.alterarSenha(null, null);
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaAmbasVazias() {
		boolean resultado = usuario.alterarSenha("", "");
		assertFalse(resultado);
	}

	@Test
	public void testeAlterarSenhaEficaz() {
		usuario.alterarSenha("123456", "654321");
		assertEquals("654321", usuario.getSenha());
	}
}
