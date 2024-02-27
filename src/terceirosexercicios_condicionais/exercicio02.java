package terceirosexercicios_condicionais;

import java.util.Scanner; 

public class exercicio02 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva um numero para saber se é impar/par e positivo/negativo: ");
		number = scanner.nextInt();
		
		if(number % 2 == 0 ) {
			System.out.print("O " + number + " é par");
		}else{
			System.out.print("O " + number + " é impar");
		}if(number < 0){
			System.out.print(" e negativo!");
		}else {
			System.out.print(" e positivo!");
		}
	
	}

}
