package terceirosexercicios_condicionais;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

		int collaboratorPosition;
		String collaboratorName;
		float oldSalary, newSalary;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Opções de Cargos:");
		System.out.println("1º Gerente com 10%");
		System.out.println("2º Vendedor com 7%");
		System.out.println("3º Supervisor com 9% ");
		System.out.println("4º Motorista com 6%");
		System.out.println("5º Estoquista com 5%");
		System.out.println("6º Técnico de TI com 8%");
		
		System.out.print("Qual o nome do colaborador? ");
		collaboratorName = scanner.nextLine();
		
		System.out.print("Escolha a posição do colaborador (1 a 6): ");
		collaboratorPosition = scanner.nextInt();
		
		System.out.print(("Escolha o salario do colaborador: "));
		oldSalary = scanner.nextFloat();
		
		switch(collaboratorPosition){
		case 1:
			System.out.printf("Nome do colaborador: " + collaboratorName + ", Cargo: Gerente, com salario atualizado de: %.2f" , (newSalary = (oldSalary + (0.10f * oldSalary))));
		break;
		case 2:
			System.out.printf("Nome do colaborador: " + collaboratorName + ", Cargo: Vendedor, com salario atualizado de: %.2f" , (newSalary = (oldSalary + (0.07f * oldSalary))));
		break;
		case 3:
			System.out.printf("Nome do colaborador: " + collaboratorName + ", Cargo: Supervisor, com salario atualizado de: %.2f" , (newSalary = (oldSalary + (0.09f * oldSalary))));
		break;
		case 4:
			System.out.printf("Nome do colaborador: " + collaboratorName + ", Cargo: Motorista, com salario atualizado de: %.2f" , (newSalary = (oldSalary + (0.06f * oldSalary))));
		break;
		case 5:
			System.out.printf("Nome do colaborador: " + collaboratorName + ", Cargo: Estoquista, com salario atualizado de: %.2f" , (newSalary = (oldSalary + (0.05f * oldSalary))));
		break;
		case 6:
			System.out.printf("Nome do colaborador: " + collaboratorName + ", Cargo: Técnico de TI, com salario atualizado de: %.2f" , (newSalary = (oldSalary + (0.08f * oldSalary))));
		break;
		
		}
		
	}

}
