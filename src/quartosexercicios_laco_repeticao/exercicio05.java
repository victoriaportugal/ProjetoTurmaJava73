package quartosexercicios_laco_repeticao;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		int number;
		int positiveSoma = 0;

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro: ");
			number = read.nextInt();
			
			if(number > 0){
				positiveSoma += number;
			}

		} while (number != 0);

		System.out.println("A soma dos números positivos é " + positiveSoma);
		
		read.close();
	}
}
