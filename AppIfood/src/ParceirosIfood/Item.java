package ParceirosIfood;

public class Item {

	private String nome;
	private String[] descricao;
	private double preco;

	public Item() {
		this.nome = "";
		this.preco = 0.0;
		this.descricao = null;
	}

	public Item(String nome, String[] descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getdescricao() {
		return this.descricao;
	}

	public void setDescricao(String[] descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}