package segundosexercicios;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1º numero: ");
		float numeroA = scanner.nextFloat();
		
		System.out.println("2º numero: ");
		float numeroB = scanner.nextFloat();
		
		float soma = numeroA + numeroB;
		float diferenca = numeroA - numeroB;
		float multiplicacao = numeroA * numeroB;
		float divisao = numeroA / numeroB;
		
		System.out.println("Soma = " + soma + " diferenca = " + diferenca + " multiplicação =" + multiplicacao + " divisao =" + divisao);
		
		scanner.close();
	}

}
