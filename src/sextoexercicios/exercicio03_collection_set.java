package sextoexercicios;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio03_collection_set {

	public static void main(String[] args) {

		int i, numbers;
		Set<Integer> differentNumber = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);

		for (i = 1; i < 11; i++) {
			System.out.println("Digite um numero sem repetição: ");
			numbers = scanner.nextInt();
			differentNumber.add(numbers);
		}

		System.out.println("Numeros: " + " " + differentNumber);
		
		scanner.close();

	}
}