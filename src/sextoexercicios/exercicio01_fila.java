package sextoexercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio01_fila {

	public static void main(String[] args) {

		boolean menu = true;
		int depositRow, chooseNumber;
		Queue<String> row = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);

		while (menu == true) {

			System.out.println("\n1- Adicionar um novo Cliente na fila ");
			System.out.println("2- Listar todos os Clientes na fila ");
			System.out.println("3- Chamar (retirar) uma pessoa da fila ");
			System.out.println("0- O programa deve ser finalizado ");
			System.out.print("\n Informe a opção que você deseja : ");
			chooseNumber = scanner.nextInt();
			switch (chooseNumber) {
			case 0:
				System.out.println("Programa Finalizado!");
				menu = false;
				break;

			case 1:
				System.out.print("Informe o nome do cliente para ser adicionado: ");
				String clientName = scanner.next().toUpperCase();
				row.add(clientName);
				System.out.println("Cliente adicionado com sucesso! ");
				break;

			case 2:
				System.out.println("\nListar todos os Clientes na fila");
				if (row.size() != 0) {
					System.out.println(row);
				} else {
					System.out.println("Ainda não possuem clientes cadastrados!");
				}
				break;

			case 3:
				System.out.println("\nChamar (retirar) uma pessoa da fila");
				if (row.size() != 0) {
					row.remove();
				}

				else {
					System.out.println("Ainda não possuem clientes cadastrados!");
				}
				break;
			default:
				System.out.println("Nao existe esta opção!");
				break;
			}

		}
	}
}
