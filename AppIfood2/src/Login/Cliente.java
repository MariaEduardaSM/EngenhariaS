package Login;
import java.util.ArrayList;

public class Cliente extends Usuario {

    public Cliente(String nome, String email, String senha, String endereco, String telefone) {
        super(nome, email, senha, endereco, telefone);
    }

    public boolean buscaEstabelecimento(ArrayList<Usuario> usuarios, String busca) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(busca)) {
                return true;
            }
        }
        return false;
    }
}
