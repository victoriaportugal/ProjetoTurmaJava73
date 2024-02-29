package quintosexercicios;

import java.util.Scanner;

public class Exercicio01_Vetores {

	public static void main(String[] args) {

		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 6, 10, 6};

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para pesquisar no vetor: ");
		int numeroEscolhido = scanner.nextInt();

		int posicao = -1;

		for (int i = 0; i < 10; i++) {
			if (vetor[i] == numeroEscolhido) {
				posicao = i;

			}
		}

		if (posicao != -1) {
			System.out.println("O numero " + numeroEscolhido + " foi encontrado na posiçao " + posicao + " do vetor.");
		} else {
			System.out.println("O numero " + numeroEscolhido + " não foi encontrado!!");
		}

		scanner.close();

	}

}
