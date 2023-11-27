package AppIfood;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

  
    Usuario usuario = new Usuario("Duda", "duda@gmail.com", "123456", "Rua A, 10", "999999999");

    Cliente cliente = new Cliente("Maria", "maria@gmail.com", "654321", "Rua B, 20", "888888888");

 
    ArrayList<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Pizza Hut", "pizzahut@gmail.com", "pizza123", "Av. C, 30", "777777777"));
   
    usuarios.add(new Usuario("McDonald's", "mcdonalds@gmail.com", "mc123", "Av. D, 40", "666666666"));
    usuarios.add(new Usuario("mcDonald's", "mcdonalds@gmail.com", "mc123", "Av. D, 40", "666666666"));
    usuarios.add(new Usuario("Subway", "subway@gmail.com", "sub123", "Av. E, 50", "555555555"));
    usuarios.add(new Usuario("subway", "subway@gmail.com", "sub123", "Av. E, 50", "555555555"));

  
    CadastroUsuario cadastro = new CadastroUsuario();

   
    boolean sair = false;

    
    while (!sair) {
      
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Alterar o nome do usuário");
      System.out.println("2 - Alterar o email do usuário");
      System.out.println("3 - Alterar o endereço do usuário");
      System.out.println("4 - Alterar o telefone do usuário");
      System.out.println("5 - Fazer login no aplicativo Ifood");
      System.out.println("6 - Buscar um estabelecimento pelo nome");
      System.out.println("7 - Cadastrar um novo usuário"); 
      System.out.println("0 - Sair");

      
      int opcao = sc.nextInt();

      
      switch (opcao) {
        
        case 1:
          
          System.out.println("Digite o novo nome do usuário:");
          String novoNome = sc.next();
          usuario.setNome(novoNome);
          System.out.println("O nome do usuário foi alterado com sucesso.");
          break;
        case 2:
          
          System.out.println("Digite o novo email do usuário:");
          String novoEmail = sc.next();
          usuario.setEmail(novoEmail);
          System.out.println("O email do usuário foi alterado com sucesso.");
          break;
        case 3:
          
          System.out.println("Digite o novo endereço do usuário:");
          String novoEndereco = sc.next();
          usuario.setEndereco(novoEndereco);
          System.out.println("O endereço do usuário foi alterado com sucesso.");
          break;
        case 4:
          
          System.out.println("Digite o novo telefone do usuário:");
          String novoTelefone = sc.next();
          usuario.setTelefone(novoTelefone);
          System.out.println("O telefone do usuário foi alterado com sucesso.");
          break;
        case 5:
          System.out.println("Digite o email e a senha para fazer login no aplicativo Ifood:");
          String email = sc.next();
          String senha = sc.next();
          boolean login = usuario.login(email, senha);
          if (login) {
            System.out.println("Login realizado com sucesso.");
            
            sair = true;
          } else {
            System.out.println("Email ou senha incorretos. Tente novamente.");
          }
          break;
        case 6:
       
          System.out.println("Digite o nome do estabelecimento que deseja buscar:");
          String nomeEstabelecimento = sc.next();
          boolean encontrado = false; 
          for (Usuario u : usuarios) { 
            if (u.getNome().equalsIgnoreCase(nomeEstabelecimento)) { 
              encontrado = true; 
              System.out.println("Estabelecimento encontrado:");
              System.out.println("Nome: " + u.getNome());
              System.out.println("Email: " + u.getEmail());
              System.out.println("Endereço: " + u.getEndereco());
              System.out.println("Telefone: " + u.getTelefone());
              break; 
            }
          }
          if (!encontrado) { 
            System.out.println("Nenhum estabelecimento com esse nome foi encontrado.");
          }
          break;
        case 7:
          
          cadastro.cadastrarUsuario(); 
          break;
        case 0:
          
          System.out.println("Obrigado por usar o aplicativo Ifood. Até mais!");
          sair = true; 
          break;
        default:
          
          System.out.println("Opção inválida. Tente novamente.");
      }
    }

    sc.close(); 
  }
}