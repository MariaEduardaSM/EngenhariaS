package Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Compras.Carrinho;
import ParceirosIfood.Item;

	public class TesteCarrinho {
	    @Test
	    public void testeAdicionarItem() {
	        Carrinho carrinho = new Carrinho();
	        Item item = new Item("X SALADA", new String[]{"PÃO,BIFE,HAMBURGUER E SALADA "}, 12.00);
	        carrinho.adicionarItem(item);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(1, itens.size());
	        assertEquals(item, itens.get(0));
	    }

	    @Test
	    public void testeRemoverItem() {
	        Carrinho carrinho = new Carrinho();
	        Item item1 = new Item("X SALADA", new String[]{"PÃO,BIFE,HAMBURGUER E SALADA"}, 12.00);
	        Item item2 = new Item("Pizza moda e casa ", new String[]{"Queijo tipo mussarela,Molho para pizza,Presunto fatiado ou ralado,Calabresa defumada fatiada,Bacom feito,Catupiry,Milho,Orégano"}, 49.99);
	        carrinho.adicionarItem(item1);
	        carrinho.adicionarItem(item2);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(2, itens.size());
	        carrinho.removerItem(item1);
	        assertEquals(1, itens.size());
	        assertEquals(item2, itens.get(0));
	    }

	    @Test
	    public void testeGetItens() {
	        Carrinho carrinho = new Carrinho();
	        Item item1 = new Item("X SALADA", new String[]{"PÃO,BIFE,HAMBURGUER E SALADA"}, 12.00);
	        Item item2 = new Item("Pizza moda e casa ", new String[]{"Queijo tipo mussarela,Molho para pizza,Presunto fatiado ou ralado,Calabresa defumada fatiada,Bacom feito,Catupiry,Milho,Orégano"}, 49.99);
	        carrinho.adicionarItem(item1);
	        carrinho.adicionarItem(item2);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(2, itens.size());
	        assertEquals(item1, itens.get(0));
	        assertEquals(item2, itens.get(1));
	    }

	    @Test
	    public void testeAdicionarItemNull() {
	        Carrinho carrinho = new Carrinho();
	        carrinho.adicionarItem(null);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(0, itens.size());
	    }

	    @Test
	    public void testeRemoverItemNull() {
	        Carrinho carrinho = new Carrinho();
	        carrinho.removerItem(null);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(0, itens.size());
	    }

	    @Test
	    public void testeAdicionarMesmoItem() {
	        Carrinho carrinho = new Carrinho();
	        Item item = new Item("X SALADA", new String[]{"PÃO,BIFE,HAMBURGUER E SALADA"}, 12.00);
	        carrinho.adicionarItem(item);
	        carrinho.adicionarItem(item);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(2, itens.size());
	    }

	    @Test
	    public void testeRemoverItemInexistente() {
	        Carrinho carrinho = new Carrinho();
	        Item item1 = new Item("X SALADA", new String[]{"PÃO,BIFE,HAMBURGUER E SALADA"}, 12.00);
	        Item item2 = new Item("Pizza Moda e casa ", new String[]{"Queijo tipo mussarela,Molho para pizza,Presunto fatiado ou ralado,Calabresa defumada fatiada,Bacom feito,Catupiry,Milho,Orégano"}, 49.99);
	        carrinho.adicionarItem(item1);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(1, itens.size());
	        carrinho.removerItem(item2);
	        assertEquals(1, itens.size());
	    }

	    @Test
	    public void testeGetItensVazio() {
	      Carrinho carrinho = new Carrinho();
	      ArrayList<Item> itens = carrinho.getItens();
	      assertTrue(itens.isEmpty());
	    }

	    @Test
	    public void testeAdicionarPrecoNegativo() {
	      Carrinho carrinho = new Carrinho();
	      Item item = new Item("X SALADA", new String[]{"PÃO,BIFE,HAMBURGUER E SALADA"}, 12.00);
	      carrinho.adicionarItem(item);
	      ArrayList<Item> itens = carrinho.getItens();
	      assertTrue(itens.isEmpty());
	    }

	    @Test
	    public void testeAdicionarItem2() {
	        Carrinho carrinho = new Carrinho();
	      
	        Item item = new Item("X BACON", new String[]{"PÃO,BIFE,HAMBURGUER,bacon.ovo"}, 18.00);
	        carrinho.adicionarItem(item);
	        ArrayList<Item> itens = carrinho.getItens();
	        assertEquals(1, itens.size());
	        assertEquals(item, itens.get(0));
	    }
	    
	}
