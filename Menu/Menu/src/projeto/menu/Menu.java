package projeto.menu;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

	public static void menu() {

		System.out.println("-------------Menu de Funcion�rios---------------");
		System.out.println("              1 - Cadastro                      ");
		System.out.println("              2 - Listar                        ");
		System.out.println("              3 - Pesquisar                     ");
		System.out.println("              4 - Ponto                         ");
		System.out.println("              5 - Sair                          ");
		System.out.println("            Escolha uma op�ao:                  ");

	}

	private static void Cadastro() {
		Scanner leitura = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		
		
		
			System.out.println("Nome completo: ");
			funcionario.setNome(leitura.nextLine());
	
		System.out.println("CPF: ");
		funcionario.setCpf(leitura.nextLine());

		System.out.println("Data de Nascimento:  ");
		funcionario.setData(leitura.nextInt());
			
		System.out.println("N�mero de celular: ");
		funcionario.setNumero(leitura.nextInt());

	}

	private static void Listar() {

	}

	private static void Pesquisar() {

	}

	private static void Ponto() {

	}

	private static void Sair() {
		System.exit(0);
	}

	public static void main(String[] args) {

	
		int opcao = 0;

		
		while (opcao != 5) 
		{
			Scanner ler = new Scanner(System.in);

			menu();

			opcao = Integer.parseInt(JOptionPane.showInputDialog("op�ao")); // ler.nextInt();

			switch (opcao) {
			case 1:
				Cadastro();
				break;
			case 2:
				Listar();
				break;
			case 3:
				Pesquisar();
				break;
			case 4:
				Ponto();
				break;
			case 5:
				Sair();
				break;

			default:
				System.out.println("Op��o inv�lida, reinicie e tente novamente.");
			}
			
		}   
		
		

	}
}
