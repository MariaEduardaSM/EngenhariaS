
package Testes;

import org.junit.Test;

import Login.Estabelecimento;
import ParceirosIfood.Item;

import static org.junit.Assert.*;

public class TesteEstabelecimento {

	public Item criarItem(String nome, String[] ingredientes, double preco) {
		Item item = new Item(nome, ingredientes, preco);
		return item;
	}

	@Test
	public void testAdicionarItem1() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem2() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem3() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem4() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem5() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem6() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem7() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem8() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);
	}

	@Test
	public void testAdicionarItem9() {

		Item[] itens = new Item[3];
		itens[1] = criarItem("Pizza de Calabresa", new String[] { "calabresa", "mussarela", "cebola" }, 25.00);
		itens[2] = criarItem("Pizza de Frango com Catupiry", new String[] { "frango", "catupiry", "orégano" }, 30.00);
		itens[3] = criarItem("Pizza de Chocolate", new String[] { "chocolate", "granulado" }, 20.00);

		Estabelecimento estabelecimento = new Estabelecimento("Pizzaria Nobre ", "pizzaria@gmail.com", "12345678912345",
				"123456", "Rua das Flores, 123", "999999999", null, null);

		for (int i = 0; i < itens.length; i++) {
			estabelecimento.adicionarItem(itens[i]);
		}

		for (int i = 0; i < itens.length; i++) {
			assertTrue(estabelecimento.getCardapio().contains(itens[i]));
		}

	}
}