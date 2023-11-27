package Login;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {

    private ArrayList<Usuario> usuarios;
    private Scanner sc;

    public CadastroUsuario() {
        usuarios = new ArrayList<Usuario>();
        sc = new Scanner(System.in);
    }

    public Usuario cadastrarUsuario() {
        System.out.println("Digite os dados do usuário que deseja cadastrar:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        String senha = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        Usuario usuario = new Usuario(nome, email,senha, endereco, telefone);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
		return usuario;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
