package primeirosexercicios;
import java.util.Scanner;

public class ExercicioNumero4 {

	public static void main(String[] args) {
		
		float numero1, numero2, numero3, numero4, numeroDiferenca;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1º Numero: ");
		numero1 = scanner.nextFloat();
		
		System.out.println("2º Numero: ");
		numero2 = scanner.nextFloat();
		
		System.out.println("3º Numero: ");
		numero3 = scanner.nextFloat();
		
		System.out.println("4º Numero: ");
		numero4 = scanner.nextFloat();
		
		numeroDiferenca = (numero1 * numero2) - (numero3 * numero4);
	
		scanner.close(); 
		
		System.out.println("A diferença é de: " + numeroDiferenca);

	}

}
