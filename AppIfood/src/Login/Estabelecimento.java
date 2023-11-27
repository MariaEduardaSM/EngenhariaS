package Login;

import java.util.ArrayList;
import ParceirosIfood.Item;

public class Estabelecimento extends Usuario {
    private String cnpj;
    private String tipo;
    private String nomeProprietario;

    private ArrayList<Item> cardapio;

    public Estabelecimento(String nome, String email, String cnpj, String tipo, String senha, String endereco, String telefone, String nomeProprietario) {
        super(nome, email, senha, endereco, telefone);
        if (cnpj.length() != 14) {
            System.out.println("O CNPJ deve ter 14 dígitos. Tente novamente.");
        } else {
            this.cnpj = cnpj;
        }
        this.tipo = tipo;
        this.nomeProprietario = nomeProprietario;
        this.cardapio = new ArrayList<>();
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

    // Método para obter o cardápio do estabelecimento com base no nome
    public ArrayList<Item> obterCardapioPorNome(String nomeEstabelecimento) {
        if (this.getNome().equals(nomeEstabelecimento)) {
            return this.cardapio;
        } else {
            System.out.println("Estabelecimento não encontrado.");
            return new ArrayList<>(); // Retorna uma lista vazia se o estabelecimento não for encontrado
        }
    }

    // Método para cadastrar um novo item no cardápio
    public void cadastrarItem(String nome, String[] descricao, double preco) {
        Item novoItem = new Item(nome, descricao, preco);
        adicionarItem(novoItem);
        System.out.println("Item cadastrado com sucesso no cardápio de " + this.getNome() + ".");
    }

    // Método para cadastrar um novo estabelecimento
    public static Estabelecimento cadastrarEstabelecimento(String email, String nomeEstabelecimento, String cnpj, String tipo, String endereco, String telefone, String nomeProprietario, String cpfProprietario, String senha) {
        Estabelecimento novoEstabelecimento = new Estabelecimento(nomeEstabelecimento, email, cnpj, tipo, senha, endereco, telefone, nomeProprietario);
        // Adicione lógica para armazenar o novo estabelecimento (por exemplo, em uma lista de estabelecimentos)
        // Pode ser necessário retornar o estabelecimento criado, dependendo da sua lógica de implementação.
        return novoEstabelecimento;
    }




    }
