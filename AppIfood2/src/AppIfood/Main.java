package AppIfood;

import java.util.Scanner;

import Login.CadastroUsuario;
import Login.Usuario;
import Login.Cliente;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		  
	   

	    Cliente cliente = new Cliente("Maria", "maria@gmail.com", "654321", "Rua B, 20", "888888888");

	 
		int choice;

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Login");
			System.out.println("2. Cadastro");
			System.out.println("3. Sair");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Digite o email:");
				String email = scanner.next();
				System.out.println("Digite a senha:");
				String senha = scanner.next();
				boolean login = false; // Lógica de login aqui
				if (login) {
					System.out.println("Login bem-sucedido!");
					System.out.print("\033[H\033[2J");
					System.out.flush();
					while (true) {
						System.out.println("Escolha uma opção:");
						System.out.println("1 - Buscar estabelecimento");
						System.out.println("2 - Meu Carrinho");
						System.out.println("3 - Meu Pedido");
						System.out.println("4 - Sair");

						choice = scanner.nextInt();

						if (choice == 4) {
							break;
						} else {
							System.out.println("Opção inválida. Tente novamente.");
						}
					}
				} else {
					System.out.println("Email ou senha incorretos. Tente novamente.");
				}
				break;
			case 2:
				CadastroUsuario cadastro = new CadastroUsuario();
				cadastro.cadastrarUsuario();
				break;
			case 3:
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
}
