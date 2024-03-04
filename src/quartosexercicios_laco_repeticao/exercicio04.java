package quartosexercicios_laco_repeticao;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		int idade, identidadeDeGenero, pessoaDesenvolvedora;
		String fraseGenero = "Seu genero é: ";
		String fraseProfissao = "Sua profissão é: ";
		String resposta = "s";
		String fraseFinal = "";

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Escreva sua idade: ");
			idade = scanner.nextInt();

			System.out.println("GENERO: 1- Mulher CiS, 2- Homem Cis, 3- Não binario, 4- Mulher trans, 5- Homem Trans ou 6- Outros");
			System.out.println("Escreva um numero (de 1 a 6): ");
			identidadeDeGenero = scanner.nextInt();

			System.out.println("PROFISSÃO: 1- BACKEND, 2- FRONTEND, 3- MOBILE, 4- FULLSTACK ");
			System.out.println("Escreva um numero (de 1 a 4): ");
			pessoaDesenvolvedora = scanner.nextInt();

			switch (identidadeDeGenero) {
			case 1:
				fraseFinal = (fraseGenero + "Mulher Cis");
				break;
			case 2:
				fraseFinal = (fraseGenero + "Homem Cis");
				break;
			case 3:
				fraseFinal = (fraseGenero + "Nao binario");
				break;
			case 4:
				fraseFinal = (fraseGenero + "Mulher trans");
				break;
			case 5:
				fraseFinal = (fraseGenero + "Homem Trans");
				break;
			case 6:
				fraseFinal = (fraseGenero + "Outros");
				break;
			} 
			System.out.println(fraseFinal);
			switch (pessoaDesenvolvedora) {
			case 1:
				System.out.println(fraseProfissao + "Backend");
				break;
			case 2:
				System.out.println(fraseProfissao + "Frontend");
				break;
			case 3:
				System.out.println(fraseProfissao + "Mobile");
				break;
			case 4:
				System.out.println(fraseProfissao + "FullStack");
				break;
			}
			System.out.println("Voce deseja continuar S/N ?");
			resposta = scanner.next();
			
		}while ((resposta.equals("S")) || (resposta.equals("s")));
				
		if((resposta.equals("n")) || (resposta.equals("N"))) {
			System.out.println("Ok, muito obrigada!");
		}
		
		scanner.close();
	}
}
