package Compras;

import java.util.ArrayList;

import ParceirosIfood.Item;

public class Carrinho {
	private ArrayList<Item> item;

	public Carrinho() {
		this.item = new ArrayList<Item>();
	}

	public void adicionarItem(Item item) {
		this.item.add(item);
	}

	public void removerItem(Item item) {
		this.item.remove(item);
	}

	public ArrayList<Item> getItens() {
		return this.item;
	}
}
