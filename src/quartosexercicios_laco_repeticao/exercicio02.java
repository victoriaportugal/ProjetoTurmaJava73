package quartosexercicios_laco_repeticao;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int i, number;
		int numberPar = 0;
		int numberImpar = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Escolha o " + i + "º numero: ");
			number = scanner.nextInt();
			
			if(number % 2 == 0) {
				numberPar++;
			} else if (number % 1 == 0) {
				numberImpar++;
			}
		}
		System.out.println("Existem " + numberPar + " numeros pares");
		System.out.println("Existem " + numberImpar + " numeros impares");

	}

}
