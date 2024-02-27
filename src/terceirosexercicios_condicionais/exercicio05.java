package terceirosexercicios_condicionais;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		int chooseNumber, numberQuantity;
		float number1 = 10.00f, number2 = 15.00f, number3 = 18.00f, number4 = 12.00f, number5 = 8.00f, number6 = 13.00f, totalValue;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Opções de itens da lanchonete:");
		System.out.println("1º Produto: Cachorro Quente, Valor: 10,00 reais");
		System.out.println("2º Produto: X-Salada, Valor: 15,00 reais");
		System.out.println("3º Produto: X-Bacon, Valor: 18,00 reais");
		System.out.println("4º Produto: Bauru, Valor: 12.0 reais");
		System.out.println("5º Produto: Refrigerante, Valor: 8,00 reais");
		System.out.println("6º Produto: Suco de laranja, Valor: 13,00 reais");
	
		
		System.out.print("Escolha o numero do item: ");
		chooseNumber = scanner.nextInt();
		
		System.out.print("Escolha a quantidade do item: ");
		numberQuantity = scanner.nextInt();
		
		switch(chooseNumber){
		case 1:
			System.out.printf("Produto: Cachorro Quente R$: %.2f" , (totalValue = (number1 * numberQuantity)));
		break;
		case 2:
			System.out.printf("Produto: X-Salada R$: %.2f" , (totalValue = (number2 * numberQuantity)));
		break;
		case 3:
			System.out.printf("Produto: X-Bacon R$: %.2f" , (totalValue = (number3 * numberQuantity)));
		break;
		case 4:
			System.out.printf("Produto: Bauru R$: %.2f" , (totalValue = (number4 * numberQuantity)));
		break;
		case 5:
			System.out.printf("Produto: Refrigerante R$: %.2f" , (totalValue = (number5 * numberQuantity)));
		break;
		case 6:
			System.out.printf("Produto: Suco de laranja R$: %.2f" , (totalValue = (number6 * numberQuantity)));
		break;
		
		}
		
	}
	
}