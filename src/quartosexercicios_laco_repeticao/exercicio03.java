package quartosexercicios_laco_repeticao;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		int age = 0, ageNew = 0, ageOld = 0;

		Scanner scanner = new Scanner(System.in);

		while (age >= 0) {

			System.out.println("Digite uma idade: ");
			age = scanner.nextInt();

			if (age < 21 && age > 0) {
				ageNew++;
			} else if (age > 50) {
				ageOld++;
			} else {
				System.out.println("Idade nao contabilizada");
			}

		}

		System.out.println("Total de pessoas maiores de 21 anos: " + ageNew);
		System.out.println("Total de pessoas menores de 50 anos: " + ageOld);
		
		scanner.close();	

	}

}
