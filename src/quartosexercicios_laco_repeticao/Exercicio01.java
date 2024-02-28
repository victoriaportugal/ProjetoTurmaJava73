package quartosexercicios_laco_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int number1, number2, i, i2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Voce escrevera 2 números para verificar se são múltiplos de 3 e 5");

		System.out.println("Escreva o 1º numero:");
		number1 = scanner.nextInt();

		System.out.println("Escreva o 2º numero:");
		number2 = scanner.nextInt();

		if (number1 > number2) {
			System.out.println("ntervalo inválido!");
		} else
			for (i = number1; i < number2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		scanner.close();
	}
}