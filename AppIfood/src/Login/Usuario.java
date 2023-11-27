package Login;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private String endereco;
	private String telefone;
	private boolean estabelecimento;

	public Usuario(String nome, String email, String senha, String endereco, String telefone) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
		this.estabelecimento = estabelecimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(boolean estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public boolean alterarSenha(String senhaAntiga, String senhaNova) {
		if (this.senha.equals(senhaAntiga)) {
			this.setSenha(senhaNova);
			return true;
		} else {
			return false;
		}
	}

	public boolean login(String email, String senha) {
		if (this.email.equals(email) && this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}
	}
}
