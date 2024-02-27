package terceirosexercicios_condicionais;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		int A, B, C, finalNumber;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual sera o numero A?");
		A = scanner.nextInt();
				
		System.out.println("Qual sera o numero B?");
		B = scanner.nextInt();
				
		System.out.println("Qual sera o numero C?");
		C = scanner.nextInt();
		
		finalNumber = A + B;
		if (finalNumber > C) {
			System.out.println("O numero " + finalNumber + " é maior que: " + C);		
		}else if(finalNumber < C) { 
			System.out.println("O numero " + finalNumber + " é menor que: " + C);
		}else {
			System.out.println("O numero " + finalNumber + " é igual a: " + C);
		}
		
	}
	
}

