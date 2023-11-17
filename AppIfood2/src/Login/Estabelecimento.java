
package Login;

import java.util.ArrayList;

import ParceirosIfood.Item;

public class Estabelecimento extends Usuario {
	private String cnpj;

	private ArrayList<Item> cardapio;

	public Estabelecimento(String nome, String email, String cnpj, String senha, String endereco, String telefone) {
		super(nome, email, senha, endereco, telefone);
		if (cnpj.length() != 14) {
			System.out.println("O CNPJ deve ter 14 dígitos. Tente novamente.");
		} else {
			this.cnpj = cnpj;
		}
		this.cardapio = new ArrayList<Item>();
	}

	public ArrayList<Item> getCardapio() {
		return cardapio;
	}

	public void setCardapio(ArrayList<Item> cardapio) {
		this.cardapio = cardapio;
	}

	public void adicionarItem(Item item) {
		this.cardapio.add(item);
	}
}
