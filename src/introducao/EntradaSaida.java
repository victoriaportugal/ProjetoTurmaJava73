package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira o sua idade: ");
		idade = leia.nextInt();
		
		System.out.println ("Bom dia, " + nome);
		System.out.println ("A sua idade é " + idade + " anos.");
	}

}
