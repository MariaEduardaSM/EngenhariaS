package Login;

import java.util.ArrayList;
import ParceirosIfood.Item;

public class Cliente extends Usuario {

	private ArrayList<Item> itensEscolhidos;

	public Cliente(String nome, String email, String senha, String endereco, String telefone) {
		super(nome, email, senha, endereco, telefone);
		this.itensEscolhidos = new ArrayList<>();
	}

	public boolean buscaEstabelecimento(ArrayList<Usuario> usuarios, String busca) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(busca)) {
				return true;
			}
		}
		return false;
	}

	public void escolherItem(Item item) {
		this.itensEscolhidos.add(item);
		System.out.println("Item escolhido: " + item.getNome());
	}

	public void fecharPedido() {
		// Exibir itens no carrinho e calcular o valor final
		System.out.println("Itens no carrinho:");

		for (Item item : itensEscolhidos) {
			System.out.println("- " + item.getNome() + " - R$" + item.getPreco());
		}

		double valorFinal = calcularValorFinal();
		System.out.println("Valor final do pedido: R$" + valorFinal);
	}

	private double calcularValorFinal() {
		double valorFinal = 0.0;

		for (Item item : itensEscolhidos) {
			valorFinal += item.getPreco();
		}

		return valorFinal;
	}

	public Item[] getitensEscolhidos() {
		// TODO Auto-generated method stub
		return null;
	}
}